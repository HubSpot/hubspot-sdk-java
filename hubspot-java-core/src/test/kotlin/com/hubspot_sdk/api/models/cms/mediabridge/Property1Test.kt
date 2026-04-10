// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.PropertyModificationMetadata
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class Property1Test {

    @Test
    fun create() {
        val property1 =
            Property1.builder()
                .description("description")
                .fieldType("fieldType")
                .groupName("groupName")
                .label("label")
                .name("name")
                .addOption(
                    Option1.builder()
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
                .dataSensitivity(Property1.DataSensitivity.HIGHLY_SENSITIVE)
                .dateDisplayHint(Property1.DateDisplayHint.ABSOLUTE)
                .displayOrder(0)
                .externalOptions(true)
                .formField(true)
                .hasUniqueValue(true)
                .hidden(true)
                .hubSpotDefined(true)
                .modificationMetadata(
                    PropertyModificationMetadata.builder()
                        .archivable(true)
                        .readOnlyDefinition(true)
                        .readOnlyValue(true)
                        .readOnlyOptions(true)
                        .build()
                )
                .referencedObjectType("referencedObjectType")
                .addSensitiveDataCategory("string")
                .showCurrencySymbol(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedUserId("updatedUserId")
                .build()

        assertThat(property1.description()).isEqualTo("description")
        assertThat(property1.fieldType()).isEqualTo("fieldType")
        assertThat(property1.groupName()).isEqualTo("groupName")
        assertThat(property1.label()).isEqualTo("label")
        assertThat(property1.name()).isEqualTo("name")
        assertThat(property1.options())
            .containsExactly(
                Option1.builder()
                    .hidden(true)
                    .label("label")
                    .value("value")
                    .description("description")
                    .displayOrder(0)
                    .build()
            )
        assertThat(property1.type()).isEqualTo("type")
        assertThat(property1.archived()).contains(true)
        assertThat(property1.archivedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(property1.calculated()).contains(true)
        assertThat(property1.calculationFormula()).contains("calculationFormula")
        assertThat(property1.createdAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(property1.createdUserId()).contains("createdUserId")
        assertThat(property1.dataSensitivity()).contains(Property1.DataSensitivity.HIGHLY_SENSITIVE)
        assertThat(property1.dateDisplayHint()).contains(Property1.DateDisplayHint.ABSOLUTE)
        assertThat(property1.displayOrder()).contains(0)
        assertThat(property1.externalOptions()).contains(true)
        assertThat(property1.formField()).contains(true)
        assertThat(property1.hasUniqueValue()).contains(true)
        assertThat(property1.hidden()).contains(true)
        assertThat(property1.hubSpotDefined()).contains(true)
        assertThat(property1.modificationMetadata())
            .contains(
                PropertyModificationMetadata.builder()
                    .archivable(true)
                    .readOnlyDefinition(true)
                    .readOnlyValue(true)
                    .readOnlyOptions(true)
                    .build()
            )
        assertThat(property1.referencedObjectType()).contains("referencedObjectType")
        assertThat(property1.sensitiveDataCategories().getOrNull()).containsExactly("string")
        assertThat(property1.showCurrencySymbol()).contains(true)
        assertThat(property1.updatedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(property1.updatedUserId()).contains("updatedUserId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val property1 =
            Property1.builder()
                .description("description")
                .fieldType("fieldType")
                .groupName("groupName")
                .label("label")
                .name("name")
                .addOption(
                    Option1.builder()
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
                .dataSensitivity(Property1.DataSensitivity.HIGHLY_SENSITIVE)
                .dateDisplayHint(Property1.DateDisplayHint.ABSOLUTE)
                .displayOrder(0)
                .externalOptions(true)
                .formField(true)
                .hasUniqueValue(true)
                .hidden(true)
                .hubSpotDefined(true)
                .modificationMetadata(
                    PropertyModificationMetadata.builder()
                        .archivable(true)
                        .readOnlyDefinition(true)
                        .readOnlyValue(true)
                        .readOnlyOptions(true)
                        .build()
                )
                .referencedObjectType("referencedObjectType")
                .addSensitiveDataCategory("string")
                .showCurrencySymbol(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedUserId("updatedUserId")
                .build()

        val roundtrippedProperty1 =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(property1),
                jacksonTypeRef<Property1>(),
            )

        assertThat(roundtrippedProperty1).isEqualTo(property1)
    }
}
