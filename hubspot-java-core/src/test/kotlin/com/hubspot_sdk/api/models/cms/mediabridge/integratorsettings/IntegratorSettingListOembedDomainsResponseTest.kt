// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegratorSettingListOembedDomainsResponseTest {

    @Test
    fun create() {
        val integratorSettingListOembedDomainsResponse =
            IntegratorSettingListOembedDomainsResponse.builder()
                .addResult(
                    IntegratorSettingListOembedDomainsResponse.Result.builder()
                        .id(0L)
                        .appId(0)
                        .createdAt(0L)
                        .deletedAt(0L)
                        .endpoints(
                            IntegratorSettingListOembedDomainsResponse.Result.Endpoints.builder()
                                .discovery(true)
                                .addScheme("string")
                                .url("url")
                                .build()
                        )
                        .portalId(0)
                        .updatedAt(0L)
                        .build()
                )
                .totalCount(0)
                .build()

        assertThat(integratorSettingListOembedDomainsResponse.results())
            .containsExactly(
                IntegratorSettingListOembedDomainsResponse.Result.builder()
                    .id(0L)
                    .appId(0)
                    .createdAt(0L)
                    .deletedAt(0L)
                    .endpoints(
                        IntegratorSettingListOembedDomainsResponse.Result.Endpoints.builder()
                            .discovery(true)
                            .addScheme("string")
                            .url("url")
                            .build()
                    )
                    .portalId(0)
                    .updatedAt(0L)
                    .build()
            )
        assertThat(integratorSettingListOembedDomainsResponse.totalCount()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integratorSettingListOembedDomainsResponse =
            IntegratorSettingListOembedDomainsResponse.builder()
                .addResult(
                    IntegratorSettingListOembedDomainsResponse.Result.builder()
                        .id(0L)
                        .appId(0)
                        .createdAt(0L)
                        .deletedAt(0L)
                        .endpoints(
                            IntegratorSettingListOembedDomainsResponse.Result.Endpoints.builder()
                                .discovery(true)
                                .addScheme("string")
                                .url("url")
                                .build()
                        )
                        .portalId(0)
                        .updatedAt(0L)
                        .build()
                )
                .totalCount(0)
                .build()

        val roundtrippedIntegratorSettingListOembedDomainsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integratorSettingListOembedDomainsResponse),
                jacksonTypeRef<IntegratorSettingListOembedDomainsResponse>(),
            )

        assertThat(roundtrippedIntegratorSettingListOembedDomainsResponse)
            .isEqualTo(integratorSettingListOembedDomainsResponse)
    }
}
