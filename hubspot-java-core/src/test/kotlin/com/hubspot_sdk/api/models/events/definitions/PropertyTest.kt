// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.definitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.Option
import com.hubspot_sdk.api.models.PropertyModificationMetadata
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyTest {

    @Test
    fun create() {
        val property =
            Property.builder()
                .description("description")
                .fieldType("fieldType")
                .groupName("groupName")
                .label("label")
                .name("name")
                .addOption(
                    Option.builder()
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
                .dataSensitivity(Property.DataSensitivity.HIGHLY_SENSITIVE)
                .dateDisplayHint(Property.DateDisplayHint.ABSOLUTE)
                .displayOrder(0)
                .externalOptions(true)
                .formField(true)
                .hasUniqueValue(true)
                .hidden(false)
                .hubspotDefined(true)
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

        assertThat(property.description()).isEqualTo("description")
        assertThat(property.fieldType()).isEqualTo("fieldType")
        assertThat(property.groupName()).isEqualTo("groupName")
        assertThat(property.label()).isEqualTo("label")
        assertThat(property.name()).isEqualTo("name")
        assertThat(property.options())
            .containsExactly(
                Option.builder()
                    .hidden(true)
                    .label("label")
                    .value("value")
                    .description("description")
                    .displayOrder(0)
                    .build()
            )
        assertThat(property.type()).isEqualTo("type")
        assertThat(property.archived()).contains(true)
        assertThat(property.archivedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(property.calculated()).contains(true)
        assertThat(property.calculationFormula()).contains("calculationFormula")
        assertThat(property.createdAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(property.createdUserId()).contains("createdUserId")
        assertThat(property.dataSensitivity()).contains(Property.DataSensitivity.HIGHLY_SENSITIVE)
        assertThat(property.dateDisplayHint()).contains(Property.DateDisplayHint.ABSOLUTE)
        assertThat(property.displayOrder()).contains(0)
        assertThat(property.externalOptions()).contains(true)
        assertThat(property.formField()).contains(true)
        assertThat(property.hasUniqueValue()).contains(true)
        assertThat(property.hidden()).contains(false)
        assertThat(property.hubspotDefined()).contains(true)
        assertThat(property.modificationMetadata())
            .contains(
                PropertyModificationMetadata.builder()
                    .archivable(true)
                    .readOnlyDefinition(true)
                    .readOnlyValue(true)
                    .readOnlyOptions(true)
                    .build()
            )
        assertThat(property.referencedObjectType()).contains("referencedObjectType")
        assertThat(property.sensitiveDataCategories().getOrNull()).containsExactly("string")
        assertThat(property.showCurrencySymbol()).contains(true)
        assertThat(property.updatedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(property.updatedUserId()).contains("updatedUserId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val property =
            Property.builder()
                .description("description")
                .fieldType("fieldType")
                .groupName("groupName")
                .label("label")
                .name("name")
                .addOption(
                    Option.builder()
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
                .dataSensitivity(Property.DataSensitivity.HIGHLY_SENSITIVE)
                .dateDisplayHint(Property.DateDisplayHint.ABSOLUTE)
                .displayOrder(0)
                .externalOptions(true)
                .formField(true)
                .hasUniqueValue(true)
                .hidden(false)
                .hubspotDefined(true)
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

        val roundtrippedProperty =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(property),
                jacksonTypeRef<Property>(),
            )

        assertThat(roundtrippedProperty).isEqualTo(property)
    }
}
