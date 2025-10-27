// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.BatchResponsePublicDefaultAssociation
import com.hubspot_sdk.api.models.crm.CollectionResponseMultiAssociatedObjectWithLabel
import com.hubspot_sdk.api.models.crm.CreatedResponseLabelsBetweenObjectPair
import com.hubspot_sdk.api.models.crm.associations.v4.V4CreateDefaultAssociationParams
import com.hubspot_sdk.api.models.crm.associations.v4.V4DeleteAssociationParams
import com.hubspot_sdk.api.models.crm.associations.v4.V4ListAssociationsByTypeParams
import com.hubspot_sdk.api.models.crm.associations.v4.V4UpdateAssociationLabelsParams
import com.hubspot_sdk.api.services.blocking.crm.associations.v4.BatchService
import com.hubspot_sdk.api.services.blocking.crm.associations.v4.ReportService
import java.util.function.Consumer

interface V4Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V4Service

    fun batch(): BatchService

    fun report(): ReportService

    /** Create the default (most generic) association type between two object types */
    fun createDefaultAssociation(
        toObjectId: String,
        params: V4CreateDefaultAssociationParams,
    ): BatchResponsePublicDefaultAssociation =
        createDefaultAssociation(toObjectId, params, RequestOptions.none())

    /** @see createDefaultAssociation */
    fun createDefaultAssociation(
        toObjectId: String,
        params: V4CreateDefaultAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicDefaultAssociation =
        createDefaultAssociation(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

    /** @see createDefaultAssociation */
    fun createDefaultAssociation(
        params: V4CreateDefaultAssociationParams
    ): BatchResponsePublicDefaultAssociation =
        createDefaultAssociation(params, RequestOptions.none())

    /** @see createDefaultAssociation */
    fun createDefaultAssociation(
        params: V4CreateDefaultAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicDefaultAssociation

    /** deletes all associations between two records. */
    fun deleteAssociation(toObjectId: String, params: V4DeleteAssociationParams) =
        deleteAssociation(toObjectId, params, RequestOptions.none())

    /** @see deleteAssociation */
    fun deleteAssociation(
        toObjectId: String,
        params: V4DeleteAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteAssociation(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

    /** @see deleteAssociation */
    fun deleteAssociation(params: V4DeleteAssociationParams) =
        deleteAssociation(params, RequestOptions.none())

    /** @see deleteAssociation */
    fun deleteAssociation(
        params: V4DeleteAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** List all associations of an object by object type. Limit 500 per call. */
    fun listAssociationsByType(
        toObjectType: String,
        params: V4ListAssociationsByTypeParams,
    ): CollectionResponseMultiAssociatedObjectWithLabel =
        listAssociationsByType(toObjectType, params, RequestOptions.none())

    /** @see listAssociationsByType */
    fun listAssociationsByType(
        toObjectType: String,
        params: V4ListAssociationsByTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseMultiAssociatedObjectWithLabel =
        listAssociationsByType(
            params.toBuilder().toObjectType(toObjectType).build(),
            requestOptions,
        )

    /** @see listAssociationsByType */
    fun listAssociationsByType(
        params: V4ListAssociationsByTypeParams
    ): CollectionResponseMultiAssociatedObjectWithLabel =
        listAssociationsByType(params, RequestOptions.none())

    /** @see listAssociationsByType */
    fun listAssociationsByType(
        params: V4ListAssociationsByTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseMultiAssociatedObjectWithLabel

    /** Set association labels between two records. */
    fun updateAssociationLabels(
        toObjectId: String,
        params: V4UpdateAssociationLabelsParams,
    ): CreatedResponseLabelsBetweenObjectPair =
        updateAssociationLabels(toObjectId, params, RequestOptions.none())

    /** @see updateAssociationLabels */
    fun updateAssociationLabels(
        toObjectId: String,
        params: V4UpdateAssociationLabelsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreatedResponseLabelsBetweenObjectPair =
        updateAssociationLabels(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

    /** @see updateAssociationLabels */
    fun updateAssociationLabels(
        params: V4UpdateAssociationLabelsParams
    ): CreatedResponseLabelsBetweenObjectPair =
        updateAssociationLabels(params, RequestOptions.none())

    /** @see updateAssociationLabels */
    fun updateAssociationLabels(
        params: V4UpdateAssociationLabelsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreatedResponseLabelsBetweenObjectPair

    /** A view of [V4Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V4Service.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        fun report(): ReportService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put
         * /crm/v4/objects/{fromObjectType}/{fromObjectId}/associations/default/{toObjectType}/{toObjectId}`,
         * but is otherwise the same as [V4Service.createDefaultAssociation].
         */
        @MustBeClosed
        fun createDefaultAssociation(
            toObjectId: String,
            params: V4CreateDefaultAssociationParams,
        ): HttpResponseFor<BatchResponsePublicDefaultAssociation> =
            createDefaultAssociation(toObjectId, params, RequestOptions.none())

        /** @see createDefaultAssociation */
        @MustBeClosed
        fun createDefaultAssociation(
            toObjectId: String,
            params: V4CreateDefaultAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicDefaultAssociation> =
            createDefaultAssociation(
                params.toBuilder().toObjectId(toObjectId).build(),
                requestOptions,
            )

        /** @see createDefaultAssociation */
        @MustBeClosed
        fun createDefaultAssociation(
            params: V4CreateDefaultAssociationParams
        ): HttpResponseFor<BatchResponsePublicDefaultAssociation> =
            createDefaultAssociation(params, RequestOptions.none())

        /** @see createDefaultAssociation */
        @MustBeClosed
        fun createDefaultAssociation(
            params: V4CreateDefaultAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicDefaultAssociation>

        /**
         * Returns a raw HTTP response for `delete
         * /crm/v4/objects/{objectType}/{objectId}/associations/{toObjectType}/{toObjectId}`, but is
         * otherwise the same as [V4Service.deleteAssociation].
         */
        @MustBeClosed
        fun deleteAssociation(toObjectId: String, params: V4DeleteAssociationParams): HttpResponse =
            deleteAssociation(toObjectId, params, RequestOptions.none())

        /** @see deleteAssociation */
        @MustBeClosed
        fun deleteAssociation(
            toObjectId: String,
            params: V4DeleteAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteAssociation(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

        /** @see deleteAssociation */
        @MustBeClosed
        fun deleteAssociation(params: V4DeleteAssociationParams): HttpResponse =
            deleteAssociation(params, RequestOptions.none())

        /** @see deleteAssociation */
        @MustBeClosed
        fun deleteAssociation(
            params: V4DeleteAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /crm/v4/objects/{objectType}/{objectId}/associations/{toObjectType}`, but is otherwise
         * the same as [V4Service.listAssociationsByType].
         */
        @MustBeClosed
        fun listAssociationsByType(
            toObjectType: String,
            params: V4ListAssociationsByTypeParams,
        ): HttpResponseFor<CollectionResponseMultiAssociatedObjectWithLabel> =
            listAssociationsByType(toObjectType, params, RequestOptions.none())

        /** @see listAssociationsByType */
        @MustBeClosed
        fun listAssociationsByType(
            toObjectType: String,
            params: V4ListAssociationsByTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseMultiAssociatedObjectWithLabel> =
            listAssociationsByType(
                params.toBuilder().toObjectType(toObjectType).build(),
                requestOptions,
            )

        /** @see listAssociationsByType */
        @MustBeClosed
        fun listAssociationsByType(
            params: V4ListAssociationsByTypeParams
        ): HttpResponseFor<CollectionResponseMultiAssociatedObjectWithLabel> =
            listAssociationsByType(params, RequestOptions.none())

        /** @see listAssociationsByType */
        @MustBeClosed
        fun listAssociationsByType(
            params: V4ListAssociationsByTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseMultiAssociatedObjectWithLabel>

        /**
         * Returns a raw HTTP response for `put
         * /crm/v4/objects/{objectType}/{objectId}/associations/{toObjectType}/{toObjectId}`, but is
         * otherwise the same as [V4Service.updateAssociationLabels].
         */
        @MustBeClosed
        fun updateAssociationLabels(
            toObjectId: String,
            params: V4UpdateAssociationLabelsParams,
        ): HttpResponseFor<CreatedResponseLabelsBetweenObjectPair> =
            updateAssociationLabels(toObjectId, params, RequestOptions.none())

        /** @see updateAssociationLabels */
        @MustBeClosed
        fun updateAssociationLabels(
            toObjectId: String,
            params: V4UpdateAssociationLabelsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreatedResponseLabelsBetweenObjectPair> =
            updateAssociationLabels(
                params.toBuilder().toObjectId(toObjectId).build(),
                requestOptions,
            )

        /** @see updateAssociationLabels */
        @MustBeClosed
        fun updateAssociationLabels(
            params: V4UpdateAssociationLabelsParams
        ): HttpResponseFor<CreatedResponseLabelsBetweenObjectPair> =
            updateAssociationLabels(params, RequestOptions.none())

        /** @see updateAssociationLabels */
        @MustBeClosed
        fun updateAssociationLabels(
            params: V4UpdateAssociationLabelsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreatedResponseLabelsBetweenObjectPair>
    }
}
