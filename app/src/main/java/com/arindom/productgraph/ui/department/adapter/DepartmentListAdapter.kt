package com.arindom.productgraph.ui.department.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arindom.productgraph.databinding.ItemDepartmentBinding
import com.arindom.productgraph.repository.models.Department
import com.arindom.productgraph.ui.EventListeners

class DepartmentListAdapter(
    private val mContext: Context,
    private var departmentList: List<Department>,
    private val departmentSelectedListener: EventListeners<Department>
) :
    RecyclerView.Adapter<DepartmentListAdapter.DepartmentViewHolder>() {
    inner class DepartmentViewHolder(private val mBinding: ItemDepartmentBinding) :
        RecyclerView.ViewHolder(mBinding.root) {
        fun bind(department: Department) {
            mBinding.ivIcon.setImageDrawable(mContext.getDrawable(department.icon))
            mBinding.tvDeptName.text = department.name
            mBinding.tvDeptDeliveries.text =
                when {
                    department.arriving != 0 -> "${department.arriving}  orders arriving"
                    department.review != 0 -> "${department.review} orders available for review"
                    else -> "no deliveries"
                }
            mBinding.root.setOnClickListener { departmentSelectedListener.postValue(department) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DepartmentViewHolder {
        return DepartmentViewHolder(
            ItemDepartmentBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: DepartmentViewHolder, position: Int) {
        holder.bind(departmentList[position])
    }

    override fun getItemCount(): Int {
        return departmentList.size
    }

    fun updateDepartment(departmentList: List<Department>) {
        this.departmentList = departmentList
    }
}