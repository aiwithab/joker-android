package com.aiwithab.joker.ui.category

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.aiwithab.joker.databinding.FragmentCategoryBinding

class CategoryFragment : Fragment() {

    private lateinit var categoryViewModel: CategoryViewModel
    private var _bindingCategoryFragment: FragmentCategoryBinding? = null

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _bindingCategoryFragment = FragmentCategoryBinding.inflate(inflater,container,false)

        categoryViewModel =
            ViewModelProvider(this).get(CategoryViewModel::class.java)

        return _bindingCategoryFragment?.root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _bindingCategoryFragment = null
    }
}