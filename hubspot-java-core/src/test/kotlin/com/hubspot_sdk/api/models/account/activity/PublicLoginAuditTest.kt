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
                .id("5432653")
                .loginAt(OffsetDateTime.parse("2022-04-01T19:36:24.303Z"))
                .loginSucceeded(true)
                .countryCode("ie")
                .email("person3@testdomain.com")
                .ipAddress("45.56.67.89")
                .location("location")
                .regionCode("d")
                .userAgent("Mozilla/5.0 (Linux; Android 11; M2101K6G)")
                .userId(876)
                .build()

        assertThat(publicLoginAudit.id()).isEqualTo("5432653")
        assertThat(publicLoginAudit.loginAt())
            .isEqualTo(OffsetDateTime.parse("2022-04-01T19:36:24.303Z"))
        assertThat(publicLoginAudit.loginSucceeded()).isEqualTo(true)
        assertThat(publicLoginAudit.countryCode()).contains("ie")
        assertThat(publicLoginAudit.email()).contains("person3@testdomain.com")
        assertThat(publicLoginAudit.ipAddress()).contains("45.56.67.89")
        assertThat(publicLoginAudit.location()).contains("location")
        assertThat(publicLoginAudit.regionCode()).contains("d")
        assertThat(publicLoginAudit.userAgent())
            .contains("Mozilla/5.0 (Linux; Android 11; M2101K6G)")
        assertThat(publicLoginAudit.userId()).contains(876)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicLoginAudit =
            PublicLoginAudit.builder()
                .id("5432653")
                .loginAt(OffsetDateTime.parse("2022-04-01T19:36:24.303Z"))
                .loginSucceeded(true)
                .countryCode("ie")
                .email("person3@testdomain.com")
                .ipAddress("45.56.67.89")
                .location("location")
                .regionCode("d")
                .userAgent("Mozilla/5.0 (Linux; Android 11; M2101K6G)")
                .userId(876)
                .build()

        val roundtrippedPublicLoginAudit =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicLoginAudit),
                jacksonTypeRef<PublicLoginAudit>(),
            )

        assertThat(roundtrippedPublicLoginAudit).isEqualTo(publicLoginAudit)
    }
}
