// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.schemas

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SchemaCreateAssociationResponseTest {

    @Test
    fun create() {
        val schemaCreateAssociationResponse =
            SchemaCreateAssociationResponse.builder()
                .id(0)
                .allowsCustomLabels(false)
                .cardinality(SchemaCreateAssociationResponse.Cardinality.ONE_TO_ONE)
                .category(SchemaCreateAssociationResponse.Category.HUBSPOT_DEFINED)
                .fromObjectTypeId("")
                .hasAllAssociatedObjects(false)
                .hasCascadingDeletes(false)
                .hasUserEnforcedMaxFromObjectIds(false)
                .hasUserEnforcedMaxToObjectIds(false)
                .hidden(false)
                .inverseAllowsCustomLabels(false)
                .inverseCardinality(SchemaCreateAssociationResponse.InverseCardinality.ONE_TO_ONE)
                .inverseHasAllAssociatedObjects(false)
                .inverseId(0)
                .inverseName("")
                .isInversePrimary(false)
                .isPrimary(false)
                .maxFromObjectIds(0)
                .maxToObjectIds(0)
                .name("")
                .portalUniqueIdentifier("")
                .toObjectTypeId("")
                .fromObjectType(SchemaCreateAssociationResponse.FromObjectType.CONTACT)
                .inverseLabel("")
                .label("")
                .toObjectType(SchemaCreateAssociationResponse.ToObjectType.CONTACT)
                .build()

        assertThat(schemaCreateAssociationResponse.id()).isEqualTo(0)
        assertThat(schemaCreateAssociationResponse.allowsCustomLabels()).isEqualTo(false)
        assertThat(schemaCreateAssociationResponse.cardinality())
            .isEqualTo(SchemaCreateAssociationResponse.Cardinality.ONE_TO_ONE)
        assertThat(schemaCreateAssociationResponse.category())
            .isEqualTo(SchemaCreateAssociationResponse.Category.HUBSPOT_DEFINED)
        assertThat(schemaCreateAssociationResponse.fromObjectTypeId()).isEqualTo("")
        assertThat(schemaCreateAssociationResponse.hasAllAssociatedObjects()).isEqualTo(false)
        assertThat(schemaCreateAssociationResponse.hasCascadingDeletes()).isEqualTo(false)
        assertThat(schemaCreateAssociationResponse.hasUserEnforcedMaxFromObjectIds())
            .isEqualTo(false)
        assertThat(schemaCreateAssociationResponse.hasUserEnforcedMaxToObjectIds()).isEqualTo(false)
        assertThat(schemaCreateAssociationResponse.hidden()).isEqualTo(false)
        assertThat(schemaCreateAssociationResponse.inverseAllowsCustomLabels()).isEqualTo(false)
        assertThat(schemaCreateAssociationResponse.inverseCardinality())
            .isEqualTo(SchemaCreateAssociationResponse.InverseCardinality.ONE_TO_ONE)
        assertThat(schemaCreateAssociationResponse.inverseHasAllAssociatedObjects())
            .isEqualTo(false)
        assertThat(schemaCreateAssociationResponse.inverseId()).isEqualTo(0)
        assertThat(schemaCreateAssociationResponse.inverseName()).isEqualTo("")
        assertThat(schemaCreateAssociationResponse.isInversePrimary()).isEqualTo(false)
        assertThat(schemaCreateAssociationResponse.isPrimary()).isEqualTo(false)
        assertThat(schemaCreateAssociationResponse.maxFromObjectIds()).isEqualTo(0)
        assertThat(schemaCreateAssociationResponse.maxToObjectIds()).isEqualTo(0)
        assertThat(schemaCreateAssociationResponse.name()).isEqualTo("")
        assertThat(schemaCreateAssociationResponse.portalUniqueIdentifier()).isEqualTo("")
        assertThat(schemaCreateAssociationResponse.toObjectTypeId()).isEqualTo("")
        assertThat(schemaCreateAssociationResponse.fromObjectType())
            .contains(SchemaCreateAssociationResponse.FromObjectType.CONTACT)
        assertThat(schemaCreateAssociationResponse.inverseLabel()).contains("")
        assertThat(schemaCreateAssociationResponse.label()).contains("")
        assertThat(schemaCreateAssociationResponse.toObjectType())
            .contains(SchemaCreateAssociationResponse.ToObjectType.CONTACT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val schemaCreateAssociationResponse =
            SchemaCreateAssociationResponse.builder()
                .id(0)
                .allowsCustomLabels(false)
                .cardinality(SchemaCreateAssociationResponse.Cardinality.ONE_TO_ONE)
                .category(SchemaCreateAssociationResponse.Category.HUBSPOT_DEFINED)
                .fromObjectTypeId("")
                .hasAllAssociatedObjects(false)
                .hasCascadingDeletes(false)
                .hasUserEnforcedMaxFromObjectIds(false)
                .hasUserEnforcedMaxToObjectIds(false)
                .hidden(false)
                .inverseAllowsCustomLabels(false)
                .inverseCardinality(SchemaCreateAssociationResponse.InverseCardinality.ONE_TO_ONE)
                .inverseHasAllAssociatedObjects(false)
                .inverseId(0)
                .inverseName("")
                .isInversePrimary(false)
                .isPrimary(false)
                .maxFromObjectIds(0)
                .maxToObjectIds(0)
                .name("")
                .portalUniqueIdentifier("")
                .toObjectTypeId("")
                .fromObjectType(SchemaCreateAssociationResponse.FromObjectType.CONTACT)
                .inverseLabel("")
                .label("")
                .toObjectType(SchemaCreateAssociationResponse.ToObjectType.CONTACT)
                .build()

        val roundtrippedSchemaCreateAssociationResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(schemaCreateAssociationResponse),
                jacksonTypeRef<SchemaCreateAssociationResponse>(),
            )

        assertThat(roundtrippedSchemaCreateAssociationResponse)
            .isEqualTo(schemaCreateAssociationResponse)
    }
}
