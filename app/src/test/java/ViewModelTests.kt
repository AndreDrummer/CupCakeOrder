package com.anjasolutions.cupcake

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.anjasolutions.cupcake.model.OrderViewModel
import java.text.NumberFormat
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class CupcakeTests {
    @get:Rule var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Test
    fun quantity_twelve_cupcakes() {
        val orderViewModel = OrderViewModel()
        orderViewModel.quantity.observeForever() {}
        orderViewModel.setQuantity(12)
        assertEquals(12, orderViewModel.quantity.value)
    }

    @Test
    fun price_twelve_cupcakes() {
        val orderViewModel = OrderViewModel()
        orderViewModel.price.observeForever() {}
        orderViewModel.setQuantity(12)
        assertEquals(NumberFormat.getCurrencyInstance().format(27), orderViewModel.price.value)
    }
}
