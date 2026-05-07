// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FetchPortalHomeCurrencyTest {

    @Test
    fun create() {
        val fetchPortalHomeCurrency =
            FetchPortalHomeCurrency.builder()
                .operator(FetchPortalHomeCurrency.Operator.FETCH_PORTAL_HOME_CURRENCY)
                .propertyName("propertyName")
                .value("value")
                .build()

        assertThat(fetchPortalHomeCurrency.operator())
            .isEqualTo(FetchPortalHomeCurrency.Operator.FETCH_PORTAL_HOME_CURRENCY)
        assertThat(fetchPortalHomeCurrency.propertyName()).contains("propertyName")
        assertThat(fetchPortalHomeCurrency.value()).contains("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fetchPortalHomeCurrency =
            FetchPortalHomeCurrency.builder()
                .operator(FetchPortalHomeCurrency.Operator.FETCH_PORTAL_HOME_CURRENCY)
                .propertyName("propertyName")
                .value("value")
                .build()

        val roundtrippedFetchPortalHomeCurrency =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fetchPortalHomeCurrency),
                jacksonTypeRef<FetchPortalHomeCurrency>(),
            )

        assertThat(roundtrippedFetchPortalHomeCurrency).isEqualTo(fetchPortalHomeCurrency)
    }
}
