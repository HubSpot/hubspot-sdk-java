// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import com.hubspot_sdk.api.models.HubDbTableRowV3Wrapper
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.models.PreviousPage
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3Test {

    @Test
    fun ofRandomAccessCollectionResponseWithTotal() {
        val randomAccessCollectionResponseWithTotal =
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
            UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3
                .ofRandomAccessCollectionResponseWithTotal(randomAccessCollectionResponseWithTotal)

        assertThat(
                unifiedCollectionResponseWithTotalBaseHubDbTableRowV3
                    .randomAccessCollectionResponseWithTotal()
            )
            .contains(randomAccessCollectionResponseWithTotal)
        assertThat(
                unifiedCollectionResponseWithTotalBaseHubDbTableRowV3
                    .streamingCollectionResponseWithTotal()
            )
            .isEmpty
    }

    @Test
    fun ofRandomAccessCollectionResponseWithTotalRoundtrip() {
        val jsonMapper = jsonMapper()
        val unifiedCollectionResponseWithTotalBaseHubDbTableRowV3 =
            UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3
                .ofRandomAccessCollectionResponseWithTotal(
                    RandomAccessCollectionResponseWithTotalHubDbTableRowV3.builder()
                        .addResult(HubDbTableRowV3Wrapper.builder().build())
                        .total(0)
                        .type(
                            RandomAccessCollectionResponseWithTotalHubDbTableRowV3.Type
                                .RANDOM_ACCESS
                        )
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
    fun ofStreamingCollectionResponseWithTotal() {
        val streamingCollectionResponseWithTotal =
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
            UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3
                .ofStreamingCollectionResponseWithTotal(streamingCollectionResponseWithTotal)

        assertThat(
                unifiedCollectionResponseWithTotalBaseHubDbTableRowV3
                    .randomAccessCollectionResponseWithTotal()
            )
            .isEmpty
        assertThat(
                unifiedCollectionResponseWithTotalBaseHubDbTableRowV3
                    .streamingCollectionResponseWithTotal()
            )
            .contains(streamingCollectionResponseWithTotal)
    }

    @Test
    fun ofStreamingCollectionResponseWithTotalRoundtrip() {
        val jsonMapper = jsonMapper()
        val unifiedCollectionResponseWithTotalBaseHubDbTableRowV3 =
            UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3
                .ofStreamingCollectionResponseWithTotal(
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
            assertThrows<HubspotInvalidDataException> {
                unifiedCollectionResponseWithTotalBaseHubDbTableRowV3.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
