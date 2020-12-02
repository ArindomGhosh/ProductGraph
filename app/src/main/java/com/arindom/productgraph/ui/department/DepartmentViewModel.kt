package com.arindom.productgraph.ui.department

import androidx.lifecycle.ViewModel
import com.arindom.productgraph.repository.models.Department
import com.arindom.productgraph.ui.EventListeners

class DepartmentViewModel : ViewModel() {
    val departmentSelectEventListener = EventListeners<Department>()
}