// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegratorSettingGetOembedDomainResponseTest {

    @Test
    fun create() {
        val integratorSettingGetOembedDomainResponse =
            IntegratorSettingGetOembedDomainResponse.builder()
                .id(0L)
                .appId(0)
                .createdAt(0L)
                .deletedAt(0L)
                .endpoints(
                    IntegratorSettingGetOembedDomainResponse.Endpoints.builder()
                        .discovery(true)
                        .addScheme("string")
                        .url("url")
                        .build()
                )
                .portalId(0)
                .updatedAt(0L)
                .build()

        assertThat(integratorSettingGetOembedDomainResponse.id()).isEqualTo(0L)
        assertThat(integratorSettingGetOembedDomainResponse.appId()).isEqualTo(0)
        assertThat(integratorSettingGetOembedDomainResponse.createdAt()).isEqualTo(0L)
        assertThat(integratorSettingGetOembedDomainResponse.deletedAt()).isEqualTo(0L)
        assertThat(integratorSettingGetOembedDomainResponse.endpoints())
            .isEqualTo(
                IntegratorSettingGetOembedDomainResponse.Endpoints.builder()
                    .discovery(true)
                    .addScheme("string")
                    .url("url")
                    .build()
            )
        assertThat(integratorSettingGetOembedDomainResponse.portalId()).isEqualTo(0)
        assertThat(integratorSettingGetOembedDomainResponse.updatedAt()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integratorSettingGetOembedDomainResponse =
            IntegratorSettingGetOembedDomainResponse.builder()
                .id(0L)
                .appId(0)
                .createdAt(0L)
                .deletedAt(0L)
                .endpoints(
                    IntegratorSettingGetOembedDomainResponse.Endpoints.builder()
                        .discovery(true)
                        .addScheme("string")
                        .url("url")
                        .build()
                )
                .portalId(0)
                .updatedAt(0L)
                .build()

        val roundtrippedIntegratorSettingGetOembedDomainResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integratorSettingGetOembedDomainResponse),
                jacksonTypeRef<IntegratorSettingGetOembedDomainResponse>(),
            )

        assertThat(roundtrippedIntegratorSettingGetOembedDomainResponse)
            .isEqualTo(integratorSettingGetOembedDomainResponse)
    }
}
