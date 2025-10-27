// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.objects

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectDeleteParamsTest {

    @Test
    fun create() {
        ObjectDeleteParams.builder().objectType("objectType").objectId("objectId").build()
    }

    @Test
    fun pathParams() {
        val params =
            ObjectDeleteParams.builder().objectType("objectType").objectId("objectId").build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        assertThat(params._pathParam(1)).isEqualTo("objectId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
