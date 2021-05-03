package com.aiwithab.joker.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.aiwithab.joker.databinding.FragmentHomeBinding
import kotlinx.coroutines.runBlocking

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    private var _bindingHomeFragment: FragmentHomeBinding? = null

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        _bindingHomeFragment = FragmentHomeBinding.inflate(inflater,container,false)

        homeViewModel =
                ViewModelProvider(this).get(HomeViewModel::class.java)





        _bindingHomeFragment?.refreshJokeFab?.setOnClickListener{

            runBlocking {
                homeViewModel.fetchRandomJoke()

                homeViewModel.textJoke.observe(viewLifecycleOwner, Observer {
                    _bindingHomeFragment?.textJoke?.text = it
                })

                homeViewModel.textPunchline.observe(viewLifecycleOwner, Observer {
                    _bindingHomeFragment?.textPunchline?.text = it
                })
            }
        }




        return _bindingHomeFragment?.root
    }




    override fun onDestroyView() {
        super.onDestroyView()
        _bindingHomeFragment = null
    }

}