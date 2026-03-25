// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class CreateMbObjectRequestTest {

    @Test
    fun ofVideo() {
        val video =
            CreateVideoObjectRequest.builder()
                .mediaType(CreateVideoObjectRequest.MediaType.VIDEO)
                .title("title")
                .bearerToken("bearerToken")
                .detailsPageLink("detailsPageLink")
                .duration(0L)
                .externalId("externalId")
                .fileUrl("fileUrl")
                .oembedUrl("oembedUrl")
                .posterUrl("posterUrl")
                .thumbnailUrl("thumbnailUrl")
                .transcriptUrl("transcriptUrl")
                .build()

        val createMbObjectRequest = CreateMbObjectRequest.ofVideo(video)

        assertThat(createMbObjectRequest.video()).contains(video)
        assertThat(createMbObjectRequest.other()).isEmpty
        assertThat(createMbObjectRequest.audio()).isEmpty
        assertThat(createMbObjectRequest.image()).isEmpty
        assertThat(createMbObjectRequest.document()).isEmpty
    }

    @Test
    fun ofVideoRoundtrip() {
        val jsonMapper = jsonMapper()
        val createMbObjectRequest =
            CreateMbObjectRequest.ofVideo(
                CreateVideoObjectRequest.builder()
                    .mediaType(CreateVideoObjectRequest.MediaType.VIDEO)
                    .title("title")
                    .bearerToken("bearerToken")
                    .detailsPageLink("detailsPageLink")
                    .duration(0L)
                    .externalId("externalId")
                    .fileUrl("fileUrl")
                    .oembedUrl("oembedUrl")
                    .posterUrl("posterUrl")
                    .thumbnailUrl("thumbnailUrl")
                    .transcriptUrl("transcriptUrl")
                    .build()
            )

        val roundtrippedCreateMbObjectRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createMbObjectRequest),
                jacksonTypeRef<CreateMbObjectRequest>(),
            )

        assertThat(roundtrippedCreateMbObjectRequest).isEqualTo(createMbObjectRequest)
    }

    @Test
    fun ofOther() {
        val other =
            CreateOtherObjectRequest.builder()
                .mediaType(CreateOtherObjectRequest.MediaType.OTHER)
                .title("title")
                .detailsPageLink("detailsPageLink")
                .duration(0L)
                .externalId("externalId")
                .fileUrl("fileUrl")
                .oembedUrl("oembedUrl")
                .posterUrl("posterUrl")
                .thumbnailUrl("thumbnailUrl")
                .build()

        val createMbObjectRequest = CreateMbObjectRequest.ofOther(other)

        assertThat(createMbObjectRequest.video()).isEmpty
        assertThat(createMbObjectRequest.other()).contains(other)
        assertThat(createMbObjectRequest.audio()).isEmpty
        assertThat(createMbObjectRequest.image()).isEmpty
        assertThat(createMbObjectRequest.document()).isEmpty
    }

    @Test
    fun ofOtherRoundtrip() {
        val jsonMapper = jsonMapper()
        val createMbObjectRequest =
            CreateMbObjectRequest.ofOther(
                CreateOtherObjectRequest.builder()
                    .mediaType(CreateOtherObjectRequest.MediaType.OTHER)
                    .title("title")
                    .detailsPageLink("detailsPageLink")
                    .duration(0L)
                    .externalId("externalId")
                    .fileUrl("fileUrl")
                    .oembedUrl("oembedUrl")
                    .posterUrl("posterUrl")
                    .thumbnailUrl("thumbnailUrl")
                    .build()
            )

        val roundtrippedCreateMbObjectRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createMbObjectRequest),
                jacksonTypeRef<CreateMbObjectRequest>(),
            )

        assertThat(roundtrippedCreateMbObjectRequest).isEqualTo(createMbObjectRequest)
    }

    @Test
    fun ofAudio() {
        val audio =
            CreateAudioObjectRequest.builder()
                .mediaType(CreateAudioObjectRequest.MediaType.AUDIO)
                .title("title")
                .detailsPageLink("detailsPageLink")
                .duration(0L)
                .externalId("externalId")
                .fileUrl("fileUrl")
                .oembedUrl("oembedUrl")
                .posterUrl("posterUrl")
                .thumbnailUrl("thumbnailUrl")
                .build()

        val createMbObjectRequest = CreateMbObjectRequest.ofAudio(audio)

        assertThat(createMbObjectRequest.video()).isEmpty
        assertThat(createMbObjectRequest.other()).isEmpty
        assertThat(createMbObjectRequest.audio()).contains(audio)
        assertThat(createMbObjectRequest.image()).isEmpty
        assertThat(createMbObjectRequest.document()).isEmpty
    }

    @Test
    fun ofAudioRoundtrip() {
        val jsonMapper = jsonMapper()
        val createMbObjectRequest =
            CreateMbObjectRequest.ofAudio(
                CreateAudioObjectRequest.builder()
                    .mediaType(CreateAudioObjectRequest.MediaType.AUDIO)
                    .title("title")
                    .detailsPageLink("detailsPageLink")
                    .duration(0L)
                    .externalId("externalId")
                    .fileUrl("fileUrl")
                    .oembedUrl("oembedUrl")
                    .posterUrl("posterUrl")
                    .thumbnailUrl("thumbnailUrl")
                    .build()
            )

        val roundtrippedCreateMbObjectRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createMbObjectRequest),
                jacksonTypeRef<CreateMbObjectRequest>(),
            )

        assertThat(roundtrippedCreateMbObjectRequest).isEqualTo(createMbObjectRequest)
    }

    @Test
    fun ofImage() {
        val image =
            CreateImageObjectRequest.builder()
                .mediaType(CreateImageObjectRequest.MediaType.IMAGE)
                .title("title")
                .detailsPageLink("detailsPageLink")
                .duration(0L)
                .externalId("externalId")
                .fileUrl("fileUrl")
                .oembedUrl("oembedUrl")
                .posterUrl("posterUrl")
                .thumbnailUrl("thumbnailUrl")
                .build()

        val createMbObjectRequest = CreateMbObjectRequest.ofImage(image)

        assertThat(createMbObjectRequest.video()).isEmpty
        assertThat(createMbObjectRequest.other()).isEmpty
        assertThat(createMbObjectRequest.audio()).isEmpty
        assertThat(createMbObjectRequest.image()).contains(image)
        assertThat(createMbObjectRequest.document()).isEmpty
    }

    @Test
    fun ofImageRoundtrip() {
        val jsonMapper = jsonMapper()
        val createMbObjectRequest =
            CreateMbObjectRequest.ofImage(
                CreateImageObjectRequest.builder()
                    .mediaType(CreateImageObjectRequest.MediaType.IMAGE)
                    .title("title")
                    .detailsPageLink("detailsPageLink")
                    .duration(0L)
                    .externalId("externalId")
                    .fileUrl("fileUrl")
                    .oembedUrl("oembedUrl")
                    .posterUrl("posterUrl")
                    .thumbnailUrl("thumbnailUrl")
                    .build()
            )

        val roundtrippedCreateMbObjectRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createMbObjectRequest),
                jacksonTypeRef<CreateMbObjectRequest>(),
            )

        assertThat(roundtrippedCreateMbObjectRequest).isEqualTo(createMbObjectRequest)
    }

    @Test
    fun ofDocument() {
        val document =
            CreateDocumentObjectRequest.builder()
                .mediaType(CreateDocumentObjectRequest.MediaType.DOCUMENT)
                .title("title")
                .detailsPageLink("detailsPageLink")
                .duration(0L)
                .externalId("externalId")
                .fileUrl("fileUrl")
                .oembedUrl("oembedUrl")
                .posterUrl("posterUrl")
                .thumbnailUrl("thumbnailUrl")
                .build()

        val createMbObjectRequest = CreateMbObjectRequest.ofDocument(document)

        assertThat(createMbObjectRequest.video()).isEmpty
        assertThat(createMbObjectRequest.other()).isEmpty
        assertThat(createMbObjectRequest.audio()).isEmpty
        assertThat(createMbObjectRequest.image()).isEmpty
        assertThat(createMbObjectRequest.document()).contains(document)
    }

    @Test
    fun ofDocumentRoundtrip() {
        val jsonMapper = jsonMapper()
        val createMbObjectRequest =
            CreateMbObjectRequest.ofDocument(
                CreateDocumentObjectRequest.builder()
                    .mediaType(CreateDocumentObjectRequest.MediaType.DOCUMENT)
                    .title("title")
                    .detailsPageLink("detailsPageLink")
                    .duration(0L)
                    .externalId("externalId")
                    .fileUrl("fileUrl")
                    .oembedUrl("oembedUrl")
                    .posterUrl("posterUrl")
                    .thumbnailUrl("thumbnailUrl")
                    .build()
            )

        val roundtrippedCreateMbObjectRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createMbObjectRequest),
                jacksonTypeRef<CreateMbObjectRequest>(),
            )

        assertThat(roundtrippedCreateMbObjectRequest).isEqualTo(createMbObjectRequest)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val createMbObjectRequest =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<CreateMbObjectRequest>())

        val e = assertThrows<HubspotInvalidDataException> { createMbObjectRequest.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
