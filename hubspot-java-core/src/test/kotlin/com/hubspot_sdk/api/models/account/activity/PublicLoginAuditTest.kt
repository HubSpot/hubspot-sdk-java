// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.account.activity

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicLoginAuditTest {

    @Test
    fun create() {
        val publicLoginAudit =
            PublicLoginAudit.builder()
                .id("id")
                .loginAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .loginSucceeded(true)
                .countryCode("countryCode")
                .email("email")
                .ipAddress("ipAddress")
                .location("location")
                .regionCode("regionCode")
                .userAgent("userAgent")
                .userId(0)
                .build()

        assertThat(publicLoginAudit.id()).isEqualTo("id")
        assertThat(publicLoginAudit.loginAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicLoginAudit.loginSucceeded()).isEqualTo(true)
        assertThat(publicLoginAudit.countryCode()).contains("countryCode")
        assertThat(publicLoginAudit.email()).contains("email")
        assertThat(publicLoginAudit.ipAddress()).contains("ipAddress")
        assertThat(publicLoginAudit.location()).contains("location")
        assertThat(publicLoginAudit.regionCode()).contains("regionCode")
        assertThat(publicLoginAudit.userAgent()).contains("userAgent")
        assertThat(publicLoginAudit.userId()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicLoginAudit =
            PublicLoginAudit.builder()
                .id("id")
                .loginAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .loginSucceeded(true)
                .countryCode("countryCode")
                .email("email")
                .ipAddress("ipAddress")
                .location("location")
                .regionCode("regionCode")
                .userAgent("userAgent")
                .userId(0)
                .build()

        val roundtrippedPublicLoginAudit =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicLoginAudit),
                jacksonTypeRef<PublicLoginAudit>(),
            )

        assertThat(roundtrippedPublicLoginAudit).isEqualTo(publicLoginAudit)
    }
}
