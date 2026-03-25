// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.meta.origins.ipranges

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IpRangeListParamsTest {

    @Test
    fun create() {
        IpRangeListParams.builder()
            .addDirection(IpRangeListParams.Direction.INGRESS)
            .addService(IpRangeListParams.Service.EMAIL)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            IpRangeListParams.builder()
                .addDirection(IpRangeListParams.Direction.INGRESS)
                .addService(IpRangeListParams.Service.EMAIL)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("direction", listOf("INGRESS").joinToString(","))
                    .put("service", listOf("EMAIL").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = IpRangeListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
