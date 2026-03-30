// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.custom

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomDeleteParamsTest {

    @Test
    fun create() {
        CustomDeleteParams.builder().objectType("objectType").objectId("objectId").build()
    }

    @Test
    fun pathParams() {
        val params =
            CustomDeleteParams.builder().objectType("objectType").objectId("objectId").build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        assertThat(params._pathParam(1)).isEqualTo("objectId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
