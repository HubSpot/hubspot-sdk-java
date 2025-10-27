// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.account

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortalInformationResponseTest {

    @Test
    fun create() {
        val portalInformationResponse =
            PortalInformationResponse.builder()
                .accountType(PortalInformationResponse.AccountType.STANDARD)
                .addAdditionalCurrency("string")
                .companyCurrency("companyCurrency")
                .dataHostingLocation("dataHostingLocation")
                .portalId(0)
                .timeZone("timeZone")
                .uiDomain("uiDomain")
                .utcOffset("utcOffset")
                .utcOffsetMilliseconds(0L)
                .build()

        assertThat(portalInformationResponse.accountType())
            .isEqualTo(PortalInformationResponse.AccountType.STANDARD)
        assertThat(portalInformationResponse.additionalCurrencies()).containsExactly("string")
        assertThat(portalInformationResponse.companyCurrency()).isEqualTo("companyCurrency")
        assertThat(portalInformationResponse.dataHostingLocation()).isEqualTo("dataHostingLocation")
        assertThat(portalInformationResponse.portalId()).isEqualTo(0)
        assertThat(portalInformationResponse.timeZone()).isEqualTo("timeZone")
        assertThat(portalInformationResponse.uiDomain()).isEqualTo("uiDomain")
        assertThat(portalInformationResponse.utcOffset()).isEqualTo("utcOffset")
        assertThat(portalInformationResponse.utcOffsetMilliseconds()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portalInformationResponse =
            PortalInformationResponse.builder()
                .accountType(PortalInformationResponse.AccountType.STANDARD)
                .addAdditionalCurrency("string")
                .companyCurrency("companyCurrency")
                .dataHostingLocation("dataHostingLocation")
                .portalId(0)
                .timeZone("timeZone")
                .uiDomain("uiDomain")
                .utcOffset("utcOffset")
                .utcOffsetMilliseconds(0L)
                .build()

        val roundtrippedPortalInformationResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portalInformationResponse),
                jacksonTypeRef<PortalInformationResponse>(),
            )

        assertThat(roundtrippedPortalInformationResponse).isEqualTo(portalInformationResponse)
    }
}
