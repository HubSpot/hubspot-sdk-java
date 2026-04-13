// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegratorObjectCreationRequestTest {

    @Test
    fun create() {
        val integratorObjectCreationRequest =
            IntegratorObjectCreationRequest.builder()
                .addMediaType(IntegratorObjectCreationRequest.MediaType.VIDEO)
                .build()

        assertThat(integratorObjectCreationRequest.mediaTypes())
            .containsExactly(IntegratorObjectCreationRequest.MediaType.VIDEO)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integratorObjectCreationRequest =
            IntegratorObjectCreationRequest.builder()
                .addMediaType(IntegratorObjectCreationRequest.MediaType.VIDEO)
                .build()

        val roundtrippedIntegratorObjectCreationRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integratorObjectCreationRequest),
                jacksonTypeRef<IntegratorObjectCreationRequest>(),
            )

        assertThat(roundtrippedIntegratorObjectCreationRequest)
            .isEqualTo(integratorObjectCreationRequest)
    }
}
