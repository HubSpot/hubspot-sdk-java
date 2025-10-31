// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.calling.transcripts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptCreateResponseTest {

    @Test
    fun create() {
        val transcriptCreateResponse = TranscriptCreateResponse.builder().id("id").build()

        assertThat(transcriptCreateResponse.id()).isEqualTo("id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptCreateResponse = TranscriptCreateResponse.builder().id("id").build()

        val roundtrippedTranscriptCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptCreateResponse),
                jacksonTypeRef<TranscriptCreateResponse>(),
            )

        assertThat(roundtrippedTranscriptCreateResponse).isEqualTo(transcriptCreateResponse)
    }
}
