// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileAttachmentTest {

    @Test
    fun create() {
        val fileAttachment =
            FileAttachment.builder()
                .fileId("fileId")
                .type(FileAttachment.Type.FILE)
                .fileUsageType(FileAttachment.FileUsageType.AUDIO)
                .build()

        assertThat(fileAttachment.fileId()).isEqualTo("fileId")
        assertThat(fileAttachment.type()).isEqualTo(FileAttachment.Type.FILE)
        assertThat(fileAttachment.fileUsageType()).contains(FileAttachment.FileUsageType.AUDIO)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileAttachment =
            FileAttachment.builder()
                .fileId("fileId")
                .type(FileAttachment.Type.FILE)
                .fileUsageType(FileAttachment.FileUsageType.AUDIO)
                .build()

        val roundtrippedFileAttachment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileAttachment),
                jacksonTypeRef<FileAttachment>(),
            )

        assertThat(roundtrippedFileAttachment).isEqualTo(fileAttachment)
    }
}
