// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.sourcecode

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileExtractRequestTest {

    @Test
    fun create() {
        val fileExtractRequest = FileExtractRequest.builder().path("path").build()

        assertThat(fileExtractRequest.path()).isEqualTo("path")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileExtractRequest = FileExtractRequest.builder().path("path").build()

        val roundtrippedFileExtractRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileExtractRequest),
                jacksonTypeRef<FileExtractRequest>(),
            )

        assertThat(roundtrippedFileExtractRequest).isEqualTo(fileExtractRequest)
    }
}
