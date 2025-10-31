// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.featureflags.portals

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortalBatchDeleteParamsTest {

    @Test
    fun create() {
        PortalBatchDeleteParams.builder().appId(0).flagName("flagName").addPortalId(0).build()
    }

    @Test
    fun pathParams() {
        val params =
            PortalBatchDeleteParams.builder().appId(0).flagName("flagName").addPortalId(0).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("flagName")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PortalBatchDeleteParams.builder().appId(0).flagName("flagName").addPortalId(0).build()

        val body = params._body()

        assertThat(body.portalIds()).containsExactly(0)
    }
}
