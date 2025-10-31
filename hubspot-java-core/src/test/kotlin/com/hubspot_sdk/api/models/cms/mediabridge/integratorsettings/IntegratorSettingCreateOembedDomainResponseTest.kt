// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegratorSettingCreateOembedDomainResponseTest {

    @Test
    fun create() {
        val integratorSettingCreateOembedDomainResponse =
            IntegratorSettingCreateOembedDomainResponse.builder()
                .id(0L)
                .appId(0)
                .createdAt(0L)
                .deletedAt(0L)
                .endpoints(
                    IntegratorSettingCreateOembedDomainResponse.Endpoints.builder()
                        .discovery(true)
                        .addScheme("string")
                        .url("url")
                        .build()
                )
                .portalId(0)
                .updatedAt(0L)
                .build()

        assertThat(integratorSettingCreateOembedDomainResponse.id()).isEqualTo(0L)
        assertThat(integratorSettingCreateOembedDomainResponse.appId()).isEqualTo(0)
        assertThat(integratorSettingCreateOembedDomainResponse.createdAt()).isEqualTo(0L)
        assertThat(integratorSettingCreateOembedDomainResponse.deletedAt()).isEqualTo(0L)
        assertThat(integratorSettingCreateOembedDomainResponse.endpoints())
            .isEqualTo(
                IntegratorSettingCreateOembedDomainResponse.Endpoints.builder()
                    .discovery(true)
                    .addScheme("string")
                    .url("url")
                    .build()
            )
        assertThat(integratorSettingCreateOembedDomainResponse.portalId()).isEqualTo(0)
        assertThat(integratorSettingCreateOembedDomainResponse.updatedAt()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integratorSettingCreateOembedDomainResponse =
            IntegratorSettingCreateOembedDomainResponse.builder()
                .id(0L)
                .appId(0)
                .createdAt(0L)
                .deletedAt(0L)
                .endpoints(
                    IntegratorSettingCreateOembedDomainResponse.Endpoints.builder()
                        .discovery(true)
                        .addScheme("string")
                        .url("url")
                        .build()
                )
                .portalId(0)
                .updatedAt(0L)
                .build()

        val roundtrippedIntegratorSettingCreateOembedDomainResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integratorSettingCreateOembedDomainResponse),
                jacksonTypeRef<IntegratorSettingCreateOembedDomainResponse>(),
            )

        assertThat(roundtrippedIntegratorSettingCreateOembedDomainResponse)
            .isEqualTo(integratorSettingCreateOembedDomainResponse)
    }
}
