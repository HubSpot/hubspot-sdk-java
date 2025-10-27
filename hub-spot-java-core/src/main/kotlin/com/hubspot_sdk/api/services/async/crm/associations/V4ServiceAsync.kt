// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associations

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
import com.hubspot_sdk.api.services.async.crm.associations.v4.BatchServiceAsync
import com.hubspot_sdk.api.services.async.crm.associations.v4.ReportServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface V4ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V4ServiceAsync

    fun batch(): BatchServiceAsync

    fun report(): ReportServiceAsync

    /** Create the default (most generic) association type between two object types */
    fun createDefaultAssociation(
        toObjectId: String,
        params: V4CreateDefaultAssociationParams,
    ): CompletableFuture<BatchResponsePublicDefaultAssociation> =
        createDefaultAssociation(toObjectId, params, RequestOptions.none())

    /** @see createDefaultAssociation */
    fun createDefaultAssociation(
        toObjectId: String,
        params: V4CreateDefaultAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicDefaultAssociation> =
        createDefaultAssociation(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

    /** @see createDefaultAssociation */
    fun createDefaultAssociation(
        params: V4CreateDefaultAssociationParams
    ): CompletableFuture<BatchResponsePublicDefaultAssociation> =
        createDefaultAssociation(params, RequestOptions.none())

    /** @see createDefaultAssociation */
    fun createDefaultAssociation(
        params: V4CreateDefaultAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicDefaultAssociation>

    /** deletes all associations between two records. */
    fun deleteAssociation(
        toObjectId: String,
        params: V4DeleteAssociationParams,
    ): CompletableFuture<Void?> = deleteAssociation(toObjectId, params, RequestOptions.none())

    /** @see deleteAssociation */
    fun deleteAssociation(
        toObjectId: String,
        params: V4DeleteAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteAssociation(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

    /** @see deleteAssociation */
    fun deleteAssociation(params: V4DeleteAssociationParams): CompletableFuture<Void?> =
        deleteAssociation(params, RequestOptions.none())

    /** @see deleteAssociation */
    fun deleteAssociation(
        params: V4DeleteAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** List all associations of an object by object type. Limit 500 per call. */
    fun listAssociationsByType(
        toObjectType: String,
        params: V4ListAssociationsByTypeParams,
    ): CompletableFuture<CollectionResponseMultiAssociatedObjectWithLabel> =
        listAssociationsByType(toObjectType, params, RequestOptions.none())

    /** @see listAssociationsByType */
    fun listAssociationsByType(
        toObjectType: String,
        params: V4ListAssociationsByTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseMultiAssociatedObjectWithLabel> =
        listAssociationsByType(
            params.toBuilder().toObjectType(toObjectType).build(),
            requestOptions,
        )

    /** @see listAssociationsByType */
    fun listAssociationsByType(
        params: V4ListAssociationsByTypeParams
    ): CompletableFuture<CollectionResponseMultiAssociatedObjectWithLabel> =
        listAssociationsByType(params, RequestOptions.none())

    /** @see listAssociationsByType */
    fun listAssociationsByType(
        params: V4ListAssociationsByTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseMultiAssociatedObjectWithLabel>

    /** Set association labels between two records. */
    fun updateAssociationLabels(
        toObjectId: String,
        params: V4UpdateAssociationLabelsParams,
    ): CompletableFuture<CreatedResponseLabelsBetweenObjectPair> =
        updateAssociationLabels(toObjectId, params, RequestOptions.none())

    /** @see updateAssociationLabels */
    fun updateAssociationLabels(
        toObjectId: String,
        params: V4UpdateAssociationLabelsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreatedResponseLabelsBetweenObjectPair> =
        updateAssociationLabels(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

    /** @see updateAssociationLabels */
    fun updateAssociationLabels(
        params: V4UpdateAssociationLabelsParams
    ): CompletableFuture<CreatedResponseLabelsBetweenObjectPair> =
        updateAssociationLabels(params, RequestOptions.none())

    /** @see updateAssociationLabels */
    fun updateAssociationLabels(
        params: V4UpdateAssociationLabelsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreatedResponseLabelsBetweenObjectPair>

    /** A view of [V4ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V4ServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        fun report(): ReportServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put
         * /crm/v4/objects/{fromObjectType}/{fromObjectId}/associations/default/{toObjectType}/{toObjectId}`,
         * but is otherwise the same as [V4ServiceAsync.createDefaultAssociation].
         */
        fun createDefaultAssociation(
            toObjectId: String,
            params: V4CreateDefaultAssociationParams,
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicDefaultAssociation>> =
            createDefaultAssociation(toObjectId, params, RequestOptions.none())

        /** @see createDefaultAssociation */
        fun createDefaultAssociation(
            toObjectId: String,
            params: V4CreateDefaultAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicDefaultAssociation>> =
            createDefaultAssociation(
                params.toBuilder().toObjectId(toObjectId).build(),
                requestOptions,
            )

        /** @see createDefaultAssociation */
        fun createDefaultAssociation(
            params: V4CreateDefaultAssociationParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicDefaultAssociation>> =
            createDefaultAssociation(params, RequestOptions.none())

        /** @see createDefaultAssociation */
        fun createDefaultAssociation(
            params: V4CreateDefaultAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicDefaultAssociation>>

        /**
         * Returns a raw HTTP response for `delete
         * /crm/v4/objects/{objectType}/{objectId}/associations/{toObjectType}/{toObjectId}`, but is
         * otherwise the same as [V4ServiceAsync.deleteAssociation].
         */
        fun deleteAssociation(
            toObjectId: String,
            params: V4DeleteAssociationParams,
        ): CompletableFuture<HttpResponse> =
            deleteAssociation(toObjectId, params, RequestOptions.none())

        /** @see deleteAssociation */
        fun deleteAssociation(
            toObjectId: String,
            params: V4DeleteAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteAssociation(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

        /** @see deleteAssociation */
        fun deleteAssociation(params: V4DeleteAssociationParams): CompletableFuture<HttpResponse> =
            deleteAssociation(params, RequestOptions.none())

        /** @see deleteAssociation */
        fun deleteAssociation(
            params: V4DeleteAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /crm/v4/objects/{objectType}/{objectId}/associations/{toObjectType}`, but is otherwise
         * the same as [V4ServiceAsync.listAssociationsByType].
         */
        fun listAssociationsByType(
            toObjectType: String,
            params: V4ListAssociationsByTypeParams,
        ): CompletableFuture<HttpResponseFor<CollectionResponseMultiAssociatedObjectWithLabel>> =
            listAssociationsByType(toObjectType, params, RequestOptions.none())

        /** @see listAssociationsByType */
        fun listAssociationsByType(
            toObjectType: String,
            params: V4ListAssociationsByTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseMultiAssociatedObjectWithLabel>> =
            listAssociationsByType(
                params.toBuilder().toObjectType(toObjectType).build(),
                requestOptions,
            )

        /** @see listAssociationsByType */
        fun listAssociationsByType(
            params: V4ListAssociationsByTypeParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseMultiAssociatedObjectWithLabel>> =
            listAssociationsByType(params, RequestOptions.none())

        /** @see listAssociationsByType */
        fun listAssociationsByType(
            params: V4ListAssociationsByTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseMultiAssociatedObjectWithLabel>>

        /**
         * Returns a raw HTTP response for `put
         * /crm/v4/objects/{objectType}/{objectId}/associations/{toObjectType}/{toObjectId}`, but is
         * otherwise the same as [V4ServiceAsync.updateAssociationLabels].
         */
        fun updateAssociationLabels(
            toObjectId: String,
            params: V4UpdateAssociationLabelsParams,
        ): CompletableFuture<HttpResponseFor<CreatedResponseLabelsBetweenObjectPair>> =
            updateAssociationLabels(toObjectId, params, RequestOptions.none())

        /** @see updateAssociationLabels */
        fun updateAssociationLabels(
            toObjectId: String,
            params: V4UpdateAssociationLabelsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreatedResponseLabelsBetweenObjectPair>> =
            updateAssociationLabels(
                params.toBuilder().toObjectId(toObjectId).build(),
                requestOptions,
            )

        /** @see updateAssociationLabels */
        fun updateAssociationLabels(
            params: V4UpdateAssociationLabelsParams
        ): CompletableFuture<HttpResponseFor<CreatedResponseLabelsBetweenObjectPair>> =
            updateAssociationLabels(params, RequestOptions.none())

        /** @see updateAssociationLabels */
        fun updateAssociationLabels(
            params: V4UpdateAssociationLabelsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreatedResponseLabelsBetweenObjectPair>>
    }
}
