// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegratorOEmbedDomainRequestTest {

    @Test
    fun create() {
        val integratorOEmbedDomainRequest =
            IntegratorOEmbedDomainRequest.builder()
                .endpoints(
                    Endpoints.builder().discovery(true).addScheme("string").url("url").build()
                )
                .portalId(0)
                .build()

        assertThat(integratorOEmbedDomainRequest.endpoints())
            .isEqualTo(Endpoints.builder().discovery(true).addScheme("string").url("url").build())
        assertThat(integratorOEmbedDomainRequest.portalId()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integratorOEmbedDomainRequest =
            IntegratorOEmbedDomainRequest.builder()
                .endpoints(
                    Endpoints.builder().discovery(true).addScheme("string").url("url").build()
                )
                .portalId(0)
                .build()

        val roundtrippedIntegratorOEmbedDomainRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integratorOEmbedDomainRequest),
                jacksonTypeRef<IntegratorOEmbedDomainRequest>(),
            )

        assertThat(roundtrippedIntegratorOEmbedDomainRequest)
            .isEqualTo(integratorOEmbedDomainRequest)
    }
}
