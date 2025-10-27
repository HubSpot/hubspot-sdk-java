// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objectlibrary.enablement

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnablementGetParamsTest {

    @Test
    fun create() {
        EnablementGetParams.builder().objectTypeId("objectTypeId").build()
    }

    @Test
    fun pathParams() {
        val params = EnablementGetParams.builder().objectTypeId("objectTypeId").build()

        assertThat(params._pathParam(0)).isEqualTo("objectTypeId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
