// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegratorOEmbedDomainModelTest {

    @Test
    fun create() {
        val integratorOEmbedDomainModel =
            IntegratorOEmbedDomainModel.builder()
                .id(0L)
                .appId(0)
                .createdAt(0L)
                .deletedAt(0L)
                .endpoints(
                    Endpoints.builder().discovery(true).addScheme("string").url("url").build()
                )
                .portalId(0)
                .updatedAt(0L)
                .build()

        assertThat(integratorOEmbedDomainModel.id()).isEqualTo(0L)
        assertThat(integratorOEmbedDomainModel.appId()).isEqualTo(0)
        assertThat(integratorOEmbedDomainModel.createdAt()).isEqualTo(0L)
        assertThat(integratorOEmbedDomainModel.deletedAt()).isEqualTo(0L)
        assertThat(integratorOEmbedDomainModel.endpoints())
            .isEqualTo(Endpoints.builder().discovery(true).addScheme("string").url("url").build())
        assertThat(integratorOEmbedDomainModel.portalId()).isEqualTo(0)
        assertThat(integratorOEmbedDomainModel.updatedAt()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integratorOEmbedDomainModel =
            IntegratorOEmbedDomainModel.builder()
                .id(0L)
                .appId(0)
                .createdAt(0L)
                .deletedAt(0L)
                .endpoints(
                    Endpoints.builder().discovery(true).addScheme("string").url("url").build()
                )
                .portalId(0)
                .updatedAt(0L)
                .build()

        val roundtrippedIntegratorOEmbedDomainModel =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integratorOEmbedDomainModel),
                jacksonTypeRef<IntegratorOEmbedDomainModel>(),
            )

        assertThat(roundtrippedIntegratorOEmbedDomainModel).isEqualTo(integratorOEmbedDomainModel)
    }
}
