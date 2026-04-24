// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.communicationpreferences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import com.hubspot.sdk.models.ErrorDetail
import com.hubspot.sdk.models.StandardError
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionResponseWithResultsSubscriptionDefinitionTest {

    @Test
    fun create() {
        val actionResponseWithResultsSubscriptionDefinition =
            ActionResponseWithResultsSubscriptionDefinition.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    SubscriptionDefinition.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .isActive(true)
                        .isDefault(true)
                        .isInternal(true)
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .businessUnitId(0L)
                        .communicationMethod("communicationMethod")
                        .purpose("purpose")
                        .addSubscriptionTranslation(
                            PublicSubscriptionTranslation.builder()
                                .createdAt(0L)
                                .description("description")
                                .languageCode("languageCode")
                                .name("name")
                                .subscriptionId(0L)
                                .updatedAt(0L)
                                .build()
                        )
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(ActionResponseWithResultsSubscriptionDefinition.Status.CANCELED)
                .addError(
                    StandardError.builder()
                        .category("category")
                        .context(
                            StandardError.Context.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addError(
                            ErrorDetail.builder()
                                .message("message")
                                .code("code")
                                .context(
                                    ErrorDetail.Context.builder()
                                        .putAdditionalProperty(
                                            "0",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "1",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "2",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "3",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "4",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "5",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "6",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "7",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "8",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "9",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "10",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "11",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "12",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "13",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "14",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "15",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "16",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "17",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "18",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "19",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "20",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "21",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "22",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "23",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "24",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "25",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "26",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "27",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "28",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "29",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "30",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "31",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .build()
                                )
                                .in_("in")
                                .subCategory("subCategory")
                                .build()
                        )
                        .links(
                            StandardError.Links.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .message("message")
                        .status("status")
                        .id("id")
                        .subCategory(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .links(
                    ActionResponseWithResultsSubscriptionDefinition.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(actionResponseWithResultsSubscriptionDefinition.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(actionResponseWithResultsSubscriptionDefinition.results())
            .containsExactly(
                SubscriptionDefinition.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .isActive(true)
                    .isDefault(true)
                    .isInternal(true)
                    .name("name")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .businessUnitId(0L)
                    .communicationMethod("communicationMethod")
                    .purpose("purpose")
                    .addSubscriptionTranslation(
                        PublicSubscriptionTranslation.builder()
                            .createdAt(0L)
                            .description("description")
                            .languageCode("languageCode")
                            .name("name")
                            .subscriptionId(0L)
                            .updatedAt(0L)
                            .build()
                    )
                    .build()
            )
        assertThat(actionResponseWithResultsSubscriptionDefinition.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(actionResponseWithResultsSubscriptionDefinition.status())
            .isEqualTo(ActionResponseWithResultsSubscriptionDefinition.Status.CANCELED)
        assertThat(actionResponseWithResultsSubscriptionDefinition.errors().getOrNull())
            .containsExactly(
                StandardError.builder()
                    .category("category")
                    .context(
                        StandardError.Context.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .addError(
                        ErrorDetail.builder()
                            .message("message")
                            .code("code")
                            .context(
                                ErrorDetail.Context.builder()
                                    .putAdditionalProperty("0", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("1", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("2", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("3", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("4", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("5", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("6", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("7", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("8", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("9", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("10", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("11", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("12", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("13", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("14", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("15", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("16", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("17", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("18", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("19", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("20", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("21", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("22", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("23", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("24", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("25", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("26", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("27", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("28", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("29", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("30", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("31", JsonValue.from(listOf("string")))
                                    .build()
                            )
                            .in_("in")
                            .subCategory("subCategory")
                            .build()
                    )
                    .links(
                        StandardError.Links.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .message("message")
                    .status("status")
                    .id("id")
                    .subCategory(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(actionResponseWithResultsSubscriptionDefinition.links())
            .contains(
                ActionResponseWithResultsSubscriptionDefinition.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(actionResponseWithResultsSubscriptionDefinition.numErrors()).contains(0)
        assertThat(actionResponseWithResultsSubscriptionDefinition.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionResponseWithResultsSubscriptionDefinition =
            ActionResponseWithResultsSubscriptionDefinition.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    SubscriptionDefinition.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .isActive(true)
                        .isDefault(true)
                        .isInternal(true)
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .businessUnitId(0L)
                        .communicationMethod("communicationMethod")
                        .purpose("purpose")
                        .addSubscriptionTranslation(
                            PublicSubscriptionTranslation.builder()
                                .createdAt(0L)
                                .description("description")
                                .languageCode("languageCode")
                                .name("name")
                                .subscriptionId(0L)
                                .updatedAt(0L)
                                .build()
                        )
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(ActionResponseWithResultsSubscriptionDefinition.Status.CANCELED)
                .addError(
                    StandardError.builder()
                        .category("category")
                        .context(
                            StandardError.Context.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addError(
                            ErrorDetail.builder()
                                .message("message")
                                .code("code")
                                .context(
                                    ErrorDetail.Context.builder()
                                        .putAdditionalProperty(
                                            "0",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "1",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "2",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "3",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "4",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "5",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "6",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "7",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "8",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "9",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "10",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "11",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "12",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "13",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "14",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "15",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "16",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "17",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "18",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "19",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "20",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "21",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "22",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "23",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "24",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "25",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "26",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "27",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "28",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "29",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "30",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "31",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .build()
                                )
                                .in_("in")
                                .subCategory("subCategory")
                                .build()
                        )
                        .links(
                            StandardError.Links.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .message("message")
                        .status("status")
                        .id("id")
                        .subCategory(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .links(
                    ActionResponseWithResultsSubscriptionDefinition.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedActionResponseWithResultsSubscriptionDefinition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionResponseWithResultsSubscriptionDefinition),
                jacksonTypeRef<ActionResponseWithResultsSubscriptionDefinition>(),
            )

        assertThat(roundtrippedActionResponseWithResultsSubscriptionDefinition)
            .isEqualTo(actionResponseWithResultsSubscriptionDefinition)
    }
}
