// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.AutomationActionsOption
import com.hubspot_sdk.api.models.ErrorDetail
import com.hubspot_sdk.api.models.StandardError
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponsePropertyWithErrorsTest {

    @Test
    fun create() {
        val batchResponsePropertyWithErrors =
            BatchResponsePropertyWithErrors.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    Property.builder()
                        .addAllowedObjectType(
                            ObjectTypeIdProto.builder().innerId(0).metaTypeId(0).build()
                        )
                        .calculated(true)
                        .canArchive(true)
                        .canRestore(true)
                        .createdAt(0L)
                        .createdUserId(0L)
                        .currencyPropertyName("currencyPropertyName")
                        .dataSensitivity(Property.DataSensitivity.HIGH)
                        .dateDisplayHint(Property.DateDisplayHint.ABSOLUTE)
                        .deleted(true)
                        .description("description")
                        .displayMode(Property.DisplayMode.ALL_UNIQUE_VERSIONS)
                        .displayOrder(0)
                        .enforceMultivalueUniqueness(true)
                        .externalOptions(true)
                        .externalOptionsReferenceType("externalOptionsReferenceType")
                        .favorited(true)
                        .favoritedOrder(0)
                        .fieldType("fieldType")
                        .formField(true)
                        .fromUserId(0L)
                        .groupName("groupName")
                        .hasUniqueValue(true)
                        .hidden(false)
                        .hubSpotDefined(true)
                        .isCustomizedDefault(true)
                        .isMultiValued(true)
                        .isPartial(true)
                        .label("label")
                        .mutableDefinitionNotDeletable(true)
                        .name("name")
                        .numberDisplayHint(Property.NumberDisplayHint.CURRENCY)
                        .addOption(
                            AutomationActionsOption.builder()
                                .description("description")
                                .displayOrder(0)
                                .doubleData(0.0)
                                .hidden(true)
                                .label("label")
                                .readOnly(true)
                                .value("value")
                                .build()
                        )
                        .optionsAreMutable(true)
                        .optionSortStrategy(Property.OptionSortStrategy.ALPHABETICAL)
                        .owningAppId(0L)
                        .portalId(0L)
                        .readOnlyDefinition(true)
                        .readOnlyValue(true)
                        .referencedObjectType(Property.ReferencedObjectType.ABANDONED_CART)
                        .searchableInGlobalSearch(true)
                        .searchTextAnalysisMode(Property.SearchTextAnalysisMode.NONE)
                        .addSensitiveDataCategory("string")
                        .showCurrencySymbol(true)
                        .textDisplayHint(Property.TextDisplayHint.DOMAIN_NAME)
                        .type(Property.Type.BOOL)
                        .updatedAt(0L)
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponsePropertyWithErrors.Status.CANCELED)
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
                    BatchResponsePropertyWithErrors.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponsePropertyWithErrors.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePropertyWithErrors.results())
            .containsExactly(
                Property.builder()
                    .addAllowedObjectType(
                        ObjectTypeIdProto.builder().innerId(0).metaTypeId(0).build()
                    )
                    .calculated(true)
                    .canArchive(true)
                    .canRestore(true)
                    .createdAt(0L)
                    .createdUserId(0L)
                    .currencyPropertyName("currencyPropertyName")
                    .dataSensitivity(Property.DataSensitivity.HIGH)
                    .dateDisplayHint(Property.DateDisplayHint.ABSOLUTE)
                    .deleted(true)
                    .description("description")
                    .displayMode(Property.DisplayMode.ALL_UNIQUE_VERSIONS)
                    .displayOrder(0)
                    .enforceMultivalueUniqueness(true)
                    .externalOptions(true)
                    .externalOptionsReferenceType("externalOptionsReferenceType")
                    .favorited(true)
                    .favoritedOrder(0)
                    .fieldType("fieldType")
                    .formField(true)
                    .fromUserId(0L)
                    .groupName("groupName")
                    .hasUniqueValue(true)
                    .hidden(false)
                    .hubSpotDefined(true)
                    .isCustomizedDefault(true)
                    .isMultiValued(true)
                    .isPartial(true)
                    .label("label")
                    .mutableDefinitionNotDeletable(true)
                    .name("name")
                    .numberDisplayHint(Property.NumberDisplayHint.CURRENCY)
                    .addOption(
                        AutomationActionsOption.builder()
                            .description("description")
                            .displayOrder(0)
                            .doubleData(0.0)
                            .hidden(true)
                            .label("label")
                            .readOnly(true)
                            .value("value")
                            .build()
                    )
                    .optionsAreMutable(true)
                    .optionSortStrategy(Property.OptionSortStrategy.ALPHABETICAL)
                    .owningAppId(0L)
                    .portalId(0L)
                    .readOnlyDefinition(true)
                    .readOnlyValue(true)
                    .referencedObjectType(Property.ReferencedObjectType.ABANDONED_CART)
                    .searchableInGlobalSearch(true)
                    .searchTextAnalysisMode(Property.SearchTextAnalysisMode.NONE)
                    .addSensitiveDataCategory("string")
                    .showCurrencySymbol(true)
                    .textDisplayHint(Property.TextDisplayHint.DOMAIN_NAME)
                    .type(Property.Type.BOOL)
                    .updatedAt(0L)
                    .build()
            )
        assertThat(batchResponsePropertyWithErrors.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePropertyWithErrors.status())
            .isEqualTo(BatchResponsePropertyWithErrors.Status.CANCELED)
        assertThat(batchResponsePropertyWithErrors.errors().getOrNull())
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
        assertThat(batchResponsePropertyWithErrors.links())
            .contains(
                BatchResponsePropertyWithErrors.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponsePropertyWithErrors.numErrors()).contains(0)
        assertThat(batchResponsePropertyWithErrors.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponsePropertyWithErrors =
            BatchResponsePropertyWithErrors.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    Property.builder()
                        .addAllowedObjectType(
                            ObjectTypeIdProto.builder().innerId(0).metaTypeId(0).build()
                        )
                        .calculated(true)
                        .canArchive(true)
                        .canRestore(true)
                        .createdAt(0L)
                        .createdUserId(0L)
                        .currencyPropertyName("currencyPropertyName")
                        .dataSensitivity(Property.DataSensitivity.HIGH)
                        .dateDisplayHint(Property.DateDisplayHint.ABSOLUTE)
                        .deleted(true)
                        .description("description")
                        .displayMode(Property.DisplayMode.ALL_UNIQUE_VERSIONS)
                        .displayOrder(0)
                        .enforceMultivalueUniqueness(true)
                        .externalOptions(true)
                        .externalOptionsReferenceType("externalOptionsReferenceType")
                        .favorited(true)
                        .favoritedOrder(0)
                        .fieldType("fieldType")
                        .formField(true)
                        .fromUserId(0L)
                        .groupName("groupName")
                        .hasUniqueValue(true)
                        .hidden(false)
                        .hubSpotDefined(true)
                        .isCustomizedDefault(true)
                        .isMultiValued(true)
                        .isPartial(true)
                        .label("label")
                        .mutableDefinitionNotDeletable(true)
                        .name("name")
                        .numberDisplayHint(Property.NumberDisplayHint.CURRENCY)
                        .addOption(
                            AutomationActionsOption.builder()
                                .description("description")
                                .displayOrder(0)
                                .doubleData(0.0)
                                .hidden(true)
                                .label("label")
                                .readOnly(true)
                                .value("value")
                                .build()
                        )
                        .optionsAreMutable(true)
                        .optionSortStrategy(Property.OptionSortStrategy.ALPHABETICAL)
                        .owningAppId(0L)
                        .portalId(0L)
                        .readOnlyDefinition(true)
                        .readOnlyValue(true)
                        .referencedObjectType(Property.ReferencedObjectType.ABANDONED_CART)
                        .searchableInGlobalSearch(true)
                        .searchTextAnalysisMode(Property.SearchTextAnalysisMode.NONE)
                        .addSensitiveDataCategory("string")
                        .showCurrencySymbol(true)
                        .textDisplayHint(Property.TextDisplayHint.DOMAIN_NAME)
                        .type(Property.Type.BOOL)
                        .updatedAt(0L)
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponsePropertyWithErrors.Status.CANCELED)
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
                    BatchResponsePropertyWithErrors.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponsePropertyWithErrors =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponsePropertyWithErrors),
                jacksonTypeRef<BatchResponsePropertyWithErrors>(),
            )

        assertThat(roundtrippedBatchResponsePropertyWithErrors)
            .isEqualTo(batchResponsePropertyWithErrors)
    }
}
