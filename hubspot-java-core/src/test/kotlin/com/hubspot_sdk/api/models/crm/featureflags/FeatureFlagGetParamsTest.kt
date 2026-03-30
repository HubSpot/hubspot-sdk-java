// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.featureflags

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeatureFlagGetParamsTest {

    @Test
    fun create() {
        FeatureFlagGetParams.builder().appId(0).flagName("flagName").portalId(0).build()
    }

    @Test
    fun pathParams() {
        val params =
            FeatureFlagGetParams.builder().appId(0).flagName("flagName").portalId(0).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("flagName")
        assertThat(params._pathParam(2)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }
}
