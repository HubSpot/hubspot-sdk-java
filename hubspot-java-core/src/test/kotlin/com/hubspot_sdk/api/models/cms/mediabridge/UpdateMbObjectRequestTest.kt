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

internal class UpdateMbObjectRequestTest {

    @Test
    fun ofVideo() {
        val video =
            UpdateVideoObjectRequest.builder()
                .mediaType(UpdateVideoObjectRequest.MediaType.VIDEO)
                .bearerToken("bearerToken")
                .detailsPageLink("detailsPageLink")
                .duration(0L)
                .externalId("externalId")
                .fileUrl("fileUrl")
                .oembedUrl("oembedUrl")
                .posterUrl("posterUrl")
                .thumbnailUrl("thumbnailUrl")
                .title("title")
                .transcriptUrl("transcriptUrl")
                .build()

        val updateMbObjectRequest = UpdateMbObjectRequest.ofVideo(video)

        assertThat(updateMbObjectRequest.video()).contains(video)
        assertThat(updateMbObjectRequest.other()).isEmpty
        assertThat(updateMbObjectRequest.audio()).isEmpty
        assertThat(updateMbObjectRequest.image()).isEmpty
        assertThat(updateMbObjectRequest.document()).isEmpty
    }

    @Test
    fun ofVideoRoundtrip() {
        val jsonMapper = jsonMapper()
        val updateMbObjectRequest =
            UpdateMbObjectRequest.ofVideo(
                UpdateVideoObjectRequest.builder()
                    .mediaType(UpdateVideoObjectRequest.MediaType.VIDEO)
                    .bearerToken("bearerToken")
                    .detailsPageLink("detailsPageLink")
                    .duration(0L)
                    .externalId("externalId")
                    .fileUrl("fileUrl")
                    .oembedUrl("oembedUrl")
                    .posterUrl("posterUrl")
                    .thumbnailUrl("thumbnailUrl")
                    .title("title")
                    .transcriptUrl("transcriptUrl")
                    .build()
            )

        val roundtrippedUpdateMbObjectRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(updateMbObjectRequest),
                jacksonTypeRef<UpdateMbObjectRequest>(),
            )

        assertThat(roundtrippedUpdateMbObjectRequest).isEqualTo(updateMbObjectRequest)
    }

    @Test
    fun ofOther() {
        val other =
            UpdateOtherObjectRequest.builder()
                .mediaType(UpdateOtherObjectRequest.MediaType.OTHER)
                .detailsPageLink("detailsPageLink")
                .duration(0L)
                .externalId("externalId")
                .fileUrl("fileUrl")
                .oembedUrl("oembedUrl")
                .posterUrl("posterUrl")
                .thumbnailUrl("thumbnailUrl")
                .title("title")
                .build()

        val updateMbObjectRequest = UpdateMbObjectRequest.ofOther(other)

        assertThat(updateMbObjectRequest.video()).isEmpty
        assertThat(updateMbObjectRequest.other()).contains(other)
        assertThat(updateMbObjectRequest.audio()).isEmpty
        assertThat(updateMbObjectRequest.image()).isEmpty
        assertThat(updateMbObjectRequest.document()).isEmpty
    }

    @Test
    fun ofOtherRoundtrip() {
        val jsonMapper = jsonMapper()
        val updateMbObjectRequest =
            UpdateMbObjectRequest.ofOther(
                UpdateOtherObjectRequest.builder()
                    .mediaType(UpdateOtherObjectRequest.MediaType.OTHER)
                    .detailsPageLink("detailsPageLink")
                    .duration(0L)
                    .externalId("externalId")
                    .fileUrl("fileUrl")
                    .oembedUrl("oembedUrl")
                    .posterUrl("posterUrl")
                    .thumbnailUrl("thumbnailUrl")
                    .title("title")
                    .build()
            )

        val roundtrippedUpdateMbObjectRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(updateMbObjectRequest),
                jacksonTypeRef<UpdateMbObjectRequest>(),
            )

        assertThat(roundtrippedUpdateMbObjectRequest).isEqualTo(updateMbObjectRequest)
    }

    @Test
    fun ofAudio() {
        val audio =
            UpdateAudioObjectRequest.builder()
                .mediaType(UpdateAudioObjectRequest.MediaType.AUDIO)
                .detailsPageLink("detailsPageLink")
                .duration(0L)
                .externalId("externalId")
                .fileUrl("fileUrl")
                .oembedUrl("oembedUrl")
                .posterUrl("posterUrl")
                .thumbnailUrl("thumbnailUrl")
                .title("title")
                .build()

        val updateMbObjectRequest = UpdateMbObjectRequest.ofAudio(audio)

        assertThat(updateMbObjectRequest.video()).isEmpty
        assertThat(updateMbObjectRequest.other()).isEmpty
        assertThat(updateMbObjectRequest.audio()).contains(audio)
        assertThat(updateMbObjectRequest.image()).isEmpty
        assertThat(updateMbObjectRequest.document()).isEmpty
    }

    @Test
    fun ofAudioRoundtrip() {
        val jsonMapper = jsonMapper()
        val updateMbObjectRequest =
            UpdateMbObjectRequest.ofAudio(
                UpdateAudioObjectRequest.builder()
                    .mediaType(UpdateAudioObjectRequest.MediaType.AUDIO)
                    .detailsPageLink("detailsPageLink")
                    .duration(0L)
                    .externalId("externalId")
                    .fileUrl("fileUrl")
                    .oembedUrl("oembedUrl")
                    .posterUrl("posterUrl")
                    .thumbnailUrl("thumbnailUrl")
                    .title("title")
                    .build()
            )

        val roundtrippedUpdateMbObjectRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(updateMbObjectRequest),
                jacksonTypeRef<UpdateMbObjectRequest>(),
            )

        assertThat(roundtrippedUpdateMbObjectRequest).isEqualTo(updateMbObjectRequest)
    }

    @Test
    fun ofImage() {
        val image =
            UpdateImageObjectRequest.builder()
                .mediaType(UpdateImageObjectRequest.MediaType.IMAGE)
                .detailsPageLink("detailsPageLink")
                .duration(0L)
                .externalId("externalId")
                .fileUrl("fileUrl")
                .oembedUrl("oembedUrl")
                .posterUrl("posterUrl")
                .thumbnailUrl("thumbnailUrl")
                .title("title")
                .build()

        val updateMbObjectRequest = UpdateMbObjectRequest.ofImage(image)

        assertThat(updateMbObjectRequest.video()).isEmpty
        assertThat(updateMbObjectRequest.other()).isEmpty
        assertThat(updateMbObjectRequest.audio()).isEmpty
        assertThat(updateMbObjectRequest.image()).contains(image)
        assertThat(updateMbObjectRequest.document()).isEmpty
    }

    @Test
    fun ofImageRoundtrip() {
        val jsonMapper = jsonMapper()
        val updateMbObjectRequest =
            UpdateMbObjectRequest.ofImage(
                UpdateImageObjectRequest.builder()
                    .mediaType(UpdateImageObjectRequest.MediaType.IMAGE)
                    .detailsPageLink("detailsPageLink")
                    .duration(0L)
                    .externalId("externalId")
                    .fileUrl("fileUrl")
                    .oembedUrl("oembedUrl")
                    .posterUrl("posterUrl")
                    .thumbnailUrl("thumbnailUrl")
                    .title("title")
                    .build()
            )

        val roundtrippedUpdateMbObjectRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(updateMbObjectRequest),
                jacksonTypeRef<UpdateMbObjectRequest>(),
            )

        assertThat(roundtrippedUpdateMbObjectRequest).isEqualTo(updateMbObjectRequest)
    }

    @Test
    fun ofDocument() {
        val document =
            UpdateDocumentObjectRequest.builder()
                .mediaType(UpdateDocumentObjectRequest.MediaType.DOCUMENT)
                .detailsPageLink("detailsPageLink")
                .duration(0L)
                .externalId("externalId")
                .fileUrl("fileUrl")
                .oembedUrl("oembedUrl")
                .posterUrl("posterUrl")
                .thumbnailUrl("thumbnailUrl")
                .title("title")
                .build()

        val updateMbObjectRequest = UpdateMbObjectRequest.ofDocument(document)

        assertThat(updateMbObjectRequest.video()).isEmpty
        assertThat(updateMbObjectRequest.other()).isEmpty
        assertThat(updateMbObjectRequest.audio()).isEmpty
        assertThat(updateMbObjectRequest.image()).isEmpty
        assertThat(updateMbObjectRequest.document()).contains(document)
    }

    @Test
    fun ofDocumentRoundtrip() {
        val jsonMapper = jsonMapper()
        val updateMbObjectRequest =
            UpdateMbObjectRequest.ofDocument(
                UpdateDocumentObjectRequest.builder()
                    .mediaType(UpdateDocumentObjectRequest.MediaType.DOCUMENT)
                    .detailsPageLink("detailsPageLink")
                    .duration(0L)
                    .externalId("externalId")
                    .fileUrl("fileUrl")
                    .oembedUrl("oembedUrl")
                    .posterUrl("posterUrl")
                    .thumbnailUrl("thumbnailUrl")
                    .title("title")
                    .build()
            )

        val roundtrippedUpdateMbObjectRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(updateMbObjectRequest),
                jacksonTypeRef<UpdateMbObjectRequest>(),
            )

        assertThat(roundtrippedUpdateMbObjectRequest).isEqualTo(updateMbObjectRequest)
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
        val updateMbObjectRequest =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<UpdateMbObjectRequest>())

        val e = assertThrows<HubspotInvalidDataException> { updateMbObjectRequest.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
