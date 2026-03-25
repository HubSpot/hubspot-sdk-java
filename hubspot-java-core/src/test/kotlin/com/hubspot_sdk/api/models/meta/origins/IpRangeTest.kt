// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.meta.origins

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IpRangeTest {

    @Test
    fun create() {
        val ipRange =
            IpRange.builder()
                .cidr("cidr")
                .description("description")
                .direction(IpRange.Direction.EGRESS)
                .service(IpRange.Service.API)
                .build()

        assertThat(ipRange.cidr()).isEqualTo("cidr")
        assertThat(ipRange.description()).isEqualTo("description")
        assertThat(ipRange.direction()).isEqualTo(IpRange.Direction.EGRESS)
        assertThat(ipRange.service()).isEqualTo(IpRange.Service.API)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ipRange =
            IpRange.builder()
                .cidr("cidr")
                .description("description")
                .direction(IpRange.Direction.EGRESS)
                .service(IpRange.Service.API)
                .build()

        val roundtrippedIpRange =
            jsonMapper.readValue(jsonMapper.writeValueAsString(ipRange), jacksonTypeRef<IpRange>())

        assertThat(roundtrippedIpRange).isEqualTo(ipRange)
    }
}
