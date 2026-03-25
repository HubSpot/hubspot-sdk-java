// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicWhatsAppTemplateMetadataTest {

    @Test
    fun create() {
        val publicWhatsAppTemplateMetadata =
            PublicWhatsAppTemplateMetadata.builder()
                .crmObjectIds(
                    PublicWhatsAppTemplateMetadata.CrmObjectIds.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .parameters(
                    PublicWhatsAppTemplateMetadata.Parameters.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .type(PublicWhatsAppTemplateMetadata.Type.WHATSAPP_TEMPLATE_METADATA)
                .contentId(0L)
                .mappedTemplateId(0L)
                .rootMicId(0L)
                .build()

        assertThat(publicWhatsAppTemplateMetadata.crmObjectIds())
            .isEqualTo(
                PublicWhatsAppTemplateMetadata.CrmObjectIds.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(publicWhatsAppTemplateMetadata.parameters())
            .isEqualTo(
                PublicWhatsAppTemplateMetadata.Parameters.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(publicWhatsAppTemplateMetadata.type())
            .isEqualTo(PublicWhatsAppTemplateMetadata.Type.WHATSAPP_TEMPLATE_METADATA)
        assertThat(publicWhatsAppTemplateMetadata.contentId()).contains(0L)
        assertThat(publicWhatsAppTemplateMetadata.mappedTemplateId()).contains(0L)
        assertThat(publicWhatsAppTemplateMetadata.rootMicId()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicWhatsAppTemplateMetadata =
            PublicWhatsAppTemplateMetadata.builder()
                .crmObjectIds(
                    PublicWhatsAppTemplateMetadata.CrmObjectIds.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .parameters(
                    PublicWhatsAppTemplateMetadata.Parameters.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .type(PublicWhatsAppTemplateMetadata.Type.WHATSAPP_TEMPLATE_METADATA)
                .contentId(0L)
                .mappedTemplateId(0L)
                .rootMicId(0L)
                .build()

        val roundtrippedPublicWhatsAppTemplateMetadata =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicWhatsAppTemplateMetadata),
                jacksonTypeRef<PublicWhatsAppTemplateMetadata>(),
            )

        assertThat(roundtrippedPublicWhatsAppTemplateMetadata)
            .isEqualTo(publicWhatsAppTemplateMetadata)
    }
}
