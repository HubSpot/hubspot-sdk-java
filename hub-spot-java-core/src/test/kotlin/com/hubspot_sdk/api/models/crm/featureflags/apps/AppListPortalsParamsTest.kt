// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.featureflags.apps

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AppListPortalsParamsTest {

    @Test
    fun create() {
        AppListPortalsParams.builder()
            .appId(0)
            .flagName("flagName")
            .limit(0)
            .startPortalId(0)
            .build()
    }

    @Test
    fun pathParams() {
        val params = AppListPortalsParams.builder().appId(0).flagName("flagName").build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("flagName")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            AppListPortalsParams.builder()
                .appId(0)
                .flagName("flagName")
                .limit(0)
                .startPortalId(0)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("limit", "0").put("startPortalId", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AppListPortalsParams.builder().appId(0).flagName("flagName").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
