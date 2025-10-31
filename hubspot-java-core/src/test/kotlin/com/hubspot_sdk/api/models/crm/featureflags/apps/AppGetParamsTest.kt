// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.featureflags.apps

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AppGetParamsTest {

    @Test
    fun create() {
        AppGetParams.builder().appId(0).flagName("flagName").build()
    }

    @Test
    fun pathParams() {
        val params = AppGetParams.builder().appId(0).flagName("flagName").build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("flagName")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
