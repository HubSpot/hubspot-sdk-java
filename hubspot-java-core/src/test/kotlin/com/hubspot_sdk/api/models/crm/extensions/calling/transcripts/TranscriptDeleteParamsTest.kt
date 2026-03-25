// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.calling.transcripts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptDeleteParamsTest {

    @Test
    fun create() {
        TranscriptDeleteParams.builder().transcriptId("transcriptId").build()
    }

    @Test
    fun pathParams() {
        val params = TranscriptDeleteParams.builder().transcriptId("transcriptId").build()

        assertThat(params._pathParam(0)).isEqualTo("transcriptId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
