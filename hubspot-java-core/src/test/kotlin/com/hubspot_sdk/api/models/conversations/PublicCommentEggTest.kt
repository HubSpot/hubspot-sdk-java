// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicCommentEggTest {

    @Test
    fun create() {
        val publicCommentEgg =
            PublicCommentEgg.builder()
                .addAttachment(
                    PublicFileEgg.builder().fileId("fileId").type(PublicFileEgg.Type.FILE).build()
                )
                .text("text")
                .type(PublicCommentEgg.Type.COMMENT)
                .richText("richText")
                .build()

        assertThat(publicCommentEgg.attachments())
            .containsExactly(
                PublicCommentEgg.Attachment.ofPublicFileEgg(
                    PublicFileEgg.builder().fileId("fileId").type(PublicFileEgg.Type.FILE).build()
                )
            )
        assertThat(publicCommentEgg.text()).isEqualTo("text")
        assertThat(publicCommentEgg.type()).isEqualTo(PublicCommentEgg.Type.COMMENT)
        assertThat(publicCommentEgg.richText()).contains("richText")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicCommentEgg =
            PublicCommentEgg.builder()
                .addAttachment(
                    PublicFileEgg.builder().fileId("fileId").type(PublicFileEgg.Type.FILE).build()
                )
                .text("text")
                .type(PublicCommentEgg.Type.COMMENT)
                .richText("richText")
                .build()

        val roundtrippedPublicCommentEgg =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicCommentEgg),
                jacksonTypeRef<PublicCommentEgg>(),
            )

        assertThat(roundtrippedPublicCommentEgg).isEqualTo(publicCommentEgg)
    }
}
