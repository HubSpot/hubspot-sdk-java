// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.meta.origins.ipranges

import com.hubspot.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IpRangeListSimpleParamsTest {

    @Test
    fun create() {
        IpRangeListSimpleParams.builder()
            .addDirection(IpRangeListSimpleParams.Direction.INGRESS)
            .addService(IpRangeListSimpleParams.Service.EMAIL)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            IpRangeListSimpleParams.builder()
                .addDirection(IpRangeListSimpleParams.Direction.INGRESS)
                .addService(IpRangeListSimpleParams.Service.EMAIL)
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
        val params = IpRangeListSimpleParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
