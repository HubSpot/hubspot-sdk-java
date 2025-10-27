// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicFileTest {

    @Test
    fun create() {
        val publicFile =
            PublicFile.builder()
                .fileId("fileId")
                .fileUsageType("fileUsageType")
                .type(PublicFile.Type.FILE)
                .url("url")
                .name("name")
                .build()

        assertThat(publicFile.fileId()).isEqualTo("fileId")
        assertThat(publicFile.fileUsageType()).isEqualTo("fileUsageType")
        assertThat(publicFile.type()).isEqualTo(PublicFile.Type.FILE)
        assertThat(publicFile.url()).isEqualTo("url")
        assertThat(publicFile.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicFile =
            PublicFile.builder()
                .fileId("fileId")
                .fileUsageType("fileUsageType")
                .type(PublicFile.Type.FILE)
                .url("url")
                .name("name")
                .build()

        val roundtrippedPublicFile =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicFile),
                jacksonTypeRef<PublicFile>(),
            )

        assertThat(roundtrippedPublicFile).isEqualTo(publicFile)
    }
}
