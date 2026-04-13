// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.featureflags

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeatureFlagGetParamsTest {

    @Test
    fun create() {
        FeatureFlagGetParams.builder().appId(0).flagName("flagName").build()
    }

    @Test
    fun pathParams() {
        val params = FeatureFlagGetParams.builder().appId(0).flagName("flagName").build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("flagName")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
