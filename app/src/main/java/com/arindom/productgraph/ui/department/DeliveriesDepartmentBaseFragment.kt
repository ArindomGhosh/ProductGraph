package com.arindom.productgraph.ui.department

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.arindom.productgraph.databinding.FragmentDepartmentsBinding
import com.arindom.productgraph.ui.department.adapter.DepartmentListAdapter

abstract class DeliveriesDepartmentBaseFragment : Fragment() {
    protected lateinit var mBinding: FragmentDepartmentsBinding
    protected val mDepartmentViewModel by viewModels<DepartmentViewModel>()
    protected val mDepartmentListAdapter by lazy {
        this.context?.let {
            DepartmentListAdapter(
                it,
                emptyList(),
                mDepartmentViewModel.departmentSelectEventListener
            )
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentDepartmentsBinding.inflate(inflater, container, false)
        setUpAdapter()
        return mBinding.root
    }

    private fun setUpAdapter() {
        mBinding.rvDepartments.adapter = mDepartmentListAdapter
        mBinding.rvDepartments.layoutManager = LinearLayoutManager(this.context)
        mDepartmentListAdapter?.notifyDataSetChanged()
    }

}