package com.aiwithab.joker.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.aiwithab.joker.R
import com.aiwithab.joker.databinding.FragmentHomeBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    private var _binding: FragmentHomeBinding? = null

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater,container,false)

        homeViewModel =
                ViewModelProvider(this).get(HomeViewModel::class.java)





        _binding?.refreshJokeFab?.setOnClickListener{

            runBlocking {
                homeViewModel.fetchRandomJoke()

                homeViewModel.textJoke.observe(viewLifecycleOwner, Observer {
                    _binding?.textJoke?.text = it
                })

                homeViewModel.textPunchline.observe(viewLifecycleOwner, Observer {
                    _binding?.textPunchline?.text = it
                })
            }
        }




        return _binding?.root
    }




    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}