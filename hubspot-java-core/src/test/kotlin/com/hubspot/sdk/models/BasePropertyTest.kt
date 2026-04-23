// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BasePropertyTest {

    @Test
    fun create() {
        val baseProperty =
            BaseProperty.builder()
                .description("description")
                .fieldType("fieldType")
                .groupName("groupName")
                .label("label")
                .name("name")
                .addOption(
                    BaseOption.builder()
                        .hidden(true)
                        .label("label")
                        .value("value")
                        .description("description")
                        .displayOrder(0)
                        .build()
                )
                .type("type")
                .archived(true)
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .calculated(true)
                .calculationFormula("calculationFormula")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdUserId("createdUserId")
                .currencyPropertyName("currencyPropertyName")
                .dataSensitivity(BaseProperty.DataSensitivity.HIGHLY_SENSITIVE)
                .dateDisplayHint(BaseProperty.DateDisplayHint.ABSOLUTE)
                .displayOrder(0)
                .externalOptions(true)
                .formField(true)
                .hasUniqueValue(true)
                .hidden(false)
                .hubSpotDefined(true)
                .modificationMetadata(
                    PropertyModificationMetadata.builder()
                        .archivable(true)
                        .readOnlyDefinition(true)
                        .readOnlyValue(true)
                        .readOnlyOptions(true)
                        .build()
                )
                .numberDisplayHint(BaseProperty.NumberDisplayHint.CURRENCY)
                .referencedObjectType("referencedObjectType")
                .addSensitiveDataCategory("string")
                .showCurrencySymbol(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedUserId("updatedUserId")
                .build()

        assertThat(baseProperty.description()).isEqualTo("description")
        assertThat(baseProperty.fieldType()).isEqualTo("fieldType")
        assertThat(baseProperty.groupName()).isEqualTo("groupName")
        assertThat(baseProperty.label()).isEqualTo("label")
        assertThat(baseProperty.name()).isEqualTo("name")
        assertThat(baseProperty.options())
            .containsExactly(
                BaseOption.builder()
                    .hidden(true)
                    .label("label")
                    .value("value")
                    .description("description")
                    .displayOrder(0)
                    .build()
            )
        assertThat(baseProperty.type()).isEqualTo("type")
        assertThat(baseProperty.archived()).contains(true)
        assertThat(baseProperty.archivedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(baseProperty.calculated()).contains(true)
        assertThat(baseProperty.calculationFormula()).contains("calculationFormula")
        assertThat(baseProperty.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(baseProperty.createdUserId()).contains("createdUserId")
        assertThat(baseProperty.currencyPropertyName()).contains("currencyPropertyName")
        assertThat(baseProperty.dataSensitivity())
            .contains(BaseProperty.DataSensitivity.HIGHLY_SENSITIVE)
        assertThat(baseProperty.dateDisplayHint()).contains(BaseProperty.DateDisplayHint.ABSOLUTE)
        assertThat(baseProperty.displayOrder()).contains(0)
        assertThat(baseProperty.externalOptions()).contains(true)
        assertThat(baseProperty.formField()).contains(true)
        assertThat(baseProperty.hasUniqueValue()).contains(true)
        assertThat(baseProperty.hidden()).contains(false)
        assertThat(baseProperty.hubSpotDefined()).contains(true)
        assertThat(baseProperty.modificationMetadata())
            .contains(
                PropertyModificationMetadata.builder()
                    .archivable(true)
                    .readOnlyDefinition(true)
                    .readOnlyValue(true)
                    .readOnlyOptions(true)
                    .build()
            )
        assertThat(baseProperty.numberDisplayHint())
            .contains(BaseProperty.NumberDisplayHint.CURRENCY)
        assertThat(baseProperty.referencedObjectType()).contains("referencedObjectType")
        assertThat(baseProperty.sensitiveDataCategories().getOrNull()).containsExactly("string")
        assertThat(baseProperty.showCurrencySymbol()).contains(true)
        assertThat(baseProperty.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(baseProperty.updatedUserId()).contains("updatedUserId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val baseProperty =
            BaseProperty.builder()
                .description("description")
                .fieldType("fieldType")
                .groupName("groupName")
                .label("label")
                .name("name")
                .addOption(
                    BaseOption.builder()
                        .hidden(true)
                        .label("label")
                        .value("value")
                        .description("description")
                        .displayOrder(0)
                        .build()
                )
                .type("type")
                .archived(true)
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .calculated(true)
                .calculationFormula("calculationFormula")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdUserId("createdUserId")
                .currencyPropertyName("currencyPropertyName")
                .dataSensitivity(BaseProperty.DataSensitivity.HIGHLY_SENSITIVE)
                .dateDisplayHint(BaseProperty.DateDisplayHint.ABSOLUTE)
                .displayOrder(0)
                .externalOptions(true)
                .formField(true)
                .hasUniqueValue(true)
                .hidden(false)
                .hubSpotDefined(true)
                .modificationMetadata(
                    PropertyModificationMetadata.builder()
                        .archivable(true)
                        .readOnlyDefinition(true)
                        .readOnlyValue(true)
                        .readOnlyOptions(true)
                        .build()
                )
                .numberDisplayHint(BaseProperty.NumberDisplayHint.CURRENCY)
                .referencedObjectType("referencedObjectType")
                .addSensitiveDataCategory("string")
                .showCurrencySymbol(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedUserId("updatedUserId")
                .build()

        val roundtrippedBaseProperty =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(baseProperty),
                jacksonTypeRef<BaseProperty>(),
            )

        assertThat(roundtrippedBaseProperty).isEqualTo(baseProperty)
    }
}
