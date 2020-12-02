package com.arindom.productgraph.ui.department

import android.os.Bundle
import androidx.navigation.findNavController
import com.arindom.productgraph.repository.getReviewDepartmentList
import com.arindom.productgraph.ui.MainActivity

class DeliveriesOpenDepartmentList : DeliveriesDepartmentBaseFragment() {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        //api call to get the list
        (activity as MainActivity).configureToolbar("Department List")
        mDepartmentListAdapter?.updateDepartment(getReviewDepartmentList())
        mDepartmentViewModel.departmentSelectEventListener.observe(viewLifecycleOwner) {
            mBinding.root
                .findNavController()
                .navigate(DeliveriesOpenDepartmentListDirections.actionDeliveriesOpenDepartmentListToNavProductList())
        }
    }
}