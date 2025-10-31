// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegratorSettingUpdateOembedDomainResponseTest {

    @Test
    fun create() {
        val integratorSettingUpdateOembedDomainResponse =
            IntegratorSettingUpdateOembedDomainResponse.builder()
                .id(0L)
                .appId(0)
                .createdAt(0L)
                .deletedAt(0L)
                .endpoints(
                    IntegratorSettingUpdateOembedDomainResponse.Endpoints.builder()
                        .discovery(true)
                        .addScheme("string")
                        .url("url")
                        .build()
                )
                .portalId(0)
                .updatedAt(0L)
                .build()

        assertThat(integratorSettingUpdateOembedDomainResponse.id()).isEqualTo(0L)
        assertThat(integratorSettingUpdateOembedDomainResponse.appId()).isEqualTo(0)
        assertThat(integratorSettingUpdateOembedDomainResponse.createdAt()).isEqualTo(0L)
        assertThat(integratorSettingUpdateOembedDomainResponse.deletedAt()).isEqualTo(0L)
        assertThat(integratorSettingUpdateOembedDomainResponse.endpoints())
            .isEqualTo(
                IntegratorSettingUpdateOembedDomainResponse.Endpoints.builder()
                    .discovery(true)
                    .addScheme("string")
                    .url("url")
                    .build()
            )
        assertThat(integratorSettingUpdateOembedDomainResponse.portalId()).isEqualTo(0)
        assertThat(integratorSettingUpdateOembedDomainResponse.updatedAt()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integratorSettingUpdateOembedDomainResponse =
            IntegratorSettingUpdateOembedDomainResponse.builder()
                .id(0L)
                .appId(0)
                .createdAt(0L)
                .deletedAt(0L)
                .endpoints(
                    IntegratorSettingUpdateOembedDomainResponse.Endpoints.builder()
                        .discovery(true)
                        .addScheme("string")
                        .url("url")
                        .build()
                )
                .portalId(0)
                .updatedAt(0L)
                .build()

        val roundtrippedIntegratorSettingUpdateOembedDomainResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integratorSettingUpdateOembedDomainResponse),
                jacksonTypeRef<IntegratorSettingUpdateOembedDomainResponse>(),
            )

        assertThat(roundtrippedIntegratorSettingUpdateOembedDomainResponse)
            .isEqualTo(integratorSettingUpdateOembedDomainResponse)
    }
}
