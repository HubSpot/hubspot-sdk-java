// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.hubdb

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import com.hubspot.sdk.models.NextPage
import com.hubspot.sdk.models.Paging
import com.hubspot.sdk.models.PreviousPage
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3Test {

    @Test
    fun ofRandomAccess() {
        val randomAccess =
            RandomAccessCollectionResponseWithTotalHubDbTableRowV3.builder()
                .addResult(HubDbTableRowV3Wrapper.builder().build())
                .total(0)
                .type(RandomAccessCollectionResponseWithTotalHubDbTableRowV3.Type.RANDOM_ACCESS)
                .paging(
                    BoundedPaging.builder()
                        .next(BoundedNextPage.builder().offset(0).link("link").build())
                        .build()
                )
                .build()

        val unifiedCollectionResponseWithTotalBaseHubDbTableRowV3 =
            UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3.ofRandomAccess(randomAccess)

        assertThat(unifiedCollectionResponseWithTotalBaseHubDbTableRowV3.randomAccess())
            .contains(randomAccess)
        assertThat(unifiedCollectionResponseWithTotalBaseHubDbTableRowV3.streaming()).isEmpty
    }

    @Test
    fun ofRandomAccessRoundtrip() {
        val jsonMapper = jsonMapper()
        val unifiedCollectionResponseWithTotalBaseHubDbTableRowV3 =
            UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3.ofRandomAccess(
                RandomAccessCollectionResponseWithTotalHubDbTableRowV3.builder()
                    .addResult(HubDbTableRowV3Wrapper.builder().build())
                    .total(0)
                    .type(RandomAccessCollectionResponseWithTotalHubDbTableRowV3.Type.RANDOM_ACCESS)
                    .paging(
                        BoundedPaging.builder()
                            .next(BoundedNextPage.builder().offset(0).link("link").build())
                            .build()
                    )
                    .build()
            )

        val roundtrippedUnifiedCollectionResponseWithTotalBaseHubDbTableRowV3 =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    unifiedCollectionResponseWithTotalBaseHubDbTableRowV3
                ),
                jacksonTypeRef<UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3>(),
            )

        assertThat(roundtrippedUnifiedCollectionResponseWithTotalBaseHubDbTableRowV3)
            .isEqualTo(unifiedCollectionResponseWithTotalBaseHubDbTableRowV3)
    }

    @Test
    fun ofStreaming() {
        val streaming =
            StreamingCollectionResponseWithTotalHubDbTableRowV3.builder()
                .addResult(HubDbTableRowV3Wrapper.builder().build())
                .total(0)
                .type(StreamingCollectionResponseWithTotalHubDbTableRowV3.Type.STREAMING)
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        val unifiedCollectionResponseWithTotalBaseHubDbTableRowV3 =
            UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3.ofStreaming(streaming)

        assertThat(unifiedCollectionResponseWithTotalBaseHubDbTableRowV3.randomAccess()).isEmpty
        assertThat(unifiedCollectionResponseWithTotalBaseHubDbTableRowV3.streaming())
            .contains(streaming)
    }

    @Test
    fun ofStreamingRoundtrip() {
        val jsonMapper = jsonMapper()
        val unifiedCollectionResponseWithTotalBaseHubDbTableRowV3 =
            UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3.ofStreaming(
                StreamingCollectionResponseWithTotalHubDbTableRowV3.builder()
                    .addResult(HubDbTableRowV3Wrapper.builder().build())
                    .total(0)
                    .type(StreamingCollectionResponseWithTotalHubDbTableRowV3.Type.STREAMING)
                    .paging(
                        Paging.builder()
                            .next(NextPage.builder().after("after").link("link").build())
                            .prev(PreviousPage.builder().before("before").link("link").build())
                            .build()
                    )
                    .build()
            )

        val roundtrippedUnifiedCollectionResponseWithTotalBaseHubDbTableRowV3 =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    unifiedCollectionResponseWithTotalBaseHubDbTableRowV3
                ),
                jacksonTypeRef<UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3>(),
            )

        assertThat(roundtrippedUnifiedCollectionResponseWithTotalBaseHubDbTableRowV3)
            .isEqualTo(unifiedCollectionResponseWithTotalBaseHubDbTableRowV3)
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
        val unifiedCollectionResponseWithTotalBaseHubDbTableRowV3 =
            jsonMapper()
                .convertValue(
                    testCase.value,
                    jacksonTypeRef<UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3>(),
                )

        val e =
            assertThrows<HubSpotInvalidDataException> {
                unifiedCollectionResponseWithTotalBaseHubDbTableRowV3.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
