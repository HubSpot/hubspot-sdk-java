// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.properties

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyDeleteParamsTest {

    @Test
    fun create() {
        PropertyDeleteParams.builder().objectType("objectType").propertyName("propertyName").build()
    }

    @Test
    fun pathParams() {
        val params =
            PropertyDeleteParams.builder()
                .objectType("objectType")
                .propertyName("propertyName")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        assertThat(params._pathParam(1)).isEqualTo("propertyName")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
