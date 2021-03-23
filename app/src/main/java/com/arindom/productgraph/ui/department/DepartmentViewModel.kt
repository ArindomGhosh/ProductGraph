package com.arindom.productgraph.ui.department

import androidx.lifecycle.ViewModel
import com.arindom.productgraph.repository.models.Department

class DepartmentViewModel : ViewModel() {
    val onDepartmentSelected: ((Department) -> Unit)? = null
}