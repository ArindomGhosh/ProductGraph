package com.arindom.productgraph.ui.department

import android.os.Bundle
import androidx.navigation.findNavController
import com.arindom.productgraph.R
import com.arindom.productgraph.repository.getArrivingDepartmentList
import com.arindom.productgraph.ui.MainActivity

class DeliveriesDepartmentReceiveDepartmentFragment : DeliveriesDepartmentBaseFragment() {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        //api call to get the list
        (activity as MainActivity).configureToolbar("Department List")
        mDepartmentListAdapter?.updateDepartment(getArrivingDepartmentList())
        mDepartmentViewModel.departmentSelectEventListener.observe(viewLifecycleOwner) {
            mBinding.root.findNavController().navigate(R.id.action_global_deliveriesHome)
        }
    }
}