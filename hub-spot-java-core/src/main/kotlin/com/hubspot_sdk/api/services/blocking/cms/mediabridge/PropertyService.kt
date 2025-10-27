// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.mediabridge

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.BatchResponseProperty
import com.hubspot_sdk.api.models.Property
import com.hubspot_sdk.api.models.cms.mediabridge.CollectionResponsePropertyNoPaging
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyArchiveBatchParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyCreateBatchParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyCreateParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyDeleteParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyGetBatchParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyGetParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyListParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyUpdateParams
import java.util.function.Consumer

interface PropertyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PropertyService

    /** Create a new property for the specified media type */
    fun create(objectType: String, params: PropertyCreateParams): Property =
        create(objectType, params, RequestOptions.none())

    /** @see create */
    fun create(
        objectType: String,
        params: PropertyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Property = create(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see create */
    fun create(params: PropertyCreateParams): Property = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PropertyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Property

    /** Update an existing property for an object type. */
    fun update(propertyName: String, params: PropertyUpdateParams): Property =
        update(propertyName, params, RequestOptions.none())

    /** @see update */
    fun update(
        propertyName: String,
        params: PropertyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Property = update(params.toBuilder().propertyName(propertyName).build(), requestOptions)

    /** @see update */
    fun update(params: PropertyUpdateParams): Property = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PropertyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Property

    /** Get the existing properties defined for a media object type. */
    fun list(objectType: String, params: PropertyListParams): CollectionResponsePropertyNoPaging =
        list(objectType, params, RequestOptions.none())

    /** @see list */
    fun list(
        objectType: String,
        params: PropertyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePropertyNoPaging =
        list(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see list */
    fun list(params: PropertyListParams): CollectionResponsePropertyNoPaging =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PropertyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePropertyNoPaging

    /** Delete an existing property for an object type. */
    fun delete(propertyName: String, params: PropertyDeleteParams) =
        delete(propertyName, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        propertyName: String,
        params: PropertyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().propertyName(propertyName).build(), requestOptions)

    /** @see delete */
    fun delete(params: PropertyDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: PropertyDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Archive a batch of existing properties for the specified types. */
    fun archiveBatch(objectType: String, params: PropertyArchiveBatchParams) =
        archiveBatch(objectType, params, RequestOptions.none())

    /** @see archiveBatch */
    fun archiveBatch(
        objectType: String,
        params: PropertyArchiveBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = archiveBatch(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see archiveBatch */
    fun archiveBatch(params: PropertyArchiveBatchParams) =
        archiveBatch(params, RequestOptions.none())

    /** @see archiveBatch */
    fun archiveBatch(
        params: PropertyArchiveBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Create a batch of properties of the specified object type. */
    fun createBatch(objectType: String, params: PropertyCreateBatchParams): BatchResponseProperty =
        createBatch(objectType, params, RequestOptions.none())

    /** @see createBatch */
    fun createBatch(
        objectType: String,
        params: PropertyCreateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseProperty =
        createBatch(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see createBatch */
    fun createBatch(params: PropertyCreateBatchParams): BatchResponseProperty =
        createBatch(params, RequestOptions.none())

    /** @see createBatch */
    fun createBatch(
        params: PropertyCreateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseProperty

    /** Get the details for an existing property by name. */
    fun get(propertyName: String, params: PropertyGetParams): Property =
        get(propertyName, params, RequestOptions.none())

    /** @see get */
    fun get(
        propertyName: String,
        params: PropertyGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Property = get(params.toBuilder().propertyName(propertyName).build(), requestOptions)

    /** @see get */
    fun get(params: PropertyGetParams): Property = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PropertyGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Property

    /** Get the details for a batch of properties for a specified object type. */
    fun getBatch(objectType: String, params: PropertyGetBatchParams): BatchResponseProperty =
        getBatch(objectType, params, RequestOptions.none())

    /** @see getBatch */
    fun getBatch(
        objectType: String,
        params: PropertyGetBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseProperty =
        getBatch(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see getBatch */
    fun getBatch(params: PropertyGetBatchParams): BatchResponseProperty =
        getBatch(params, RequestOptions.none())

    /** @see getBatch */
    fun getBatch(
        params: PropertyGetBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseProperty

    /** A view of [PropertyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PropertyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /media-bridge/v1/{appId}/properties/{objectType}`,
         * but is otherwise the same as [PropertyService.create].
         */
        @MustBeClosed
        fun create(objectType: String, params: PropertyCreateParams): HttpResponseFor<Property> =
            create(objectType, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            objectType: String,
            params: PropertyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Property> =
            create(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: PropertyCreateParams): HttpResponseFor<Property> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PropertyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Property>

        /**
         * Returns a raw HTTP response for `patch
         * /media-bridge/v1/{appId}/properties/{objectType}/{propertyName}`, but is otherwise the
         * same as [PropertyService.update].
         */
        @MustBeClosed
        fun update(propertyName: String, params: PropertyUpdateParams): HttpResponseFor<Property> =
            update(propertyName, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            propertyName: String,
            params: PropertyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Property> =
            update(params.toBuilder().propertyName(propertyName).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: PropertyUpdateParams): HttpResponseFor<Property> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: PropertyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Property>

        /**
         * Returns a raw HTTP response for `get /media-bridge/v1/{appId}/properties/{objectType}`,
         * but is otherwise the same as [PropertyService.list].
         */
        @MustBeClosed
        fun list(
            objectType: String,
            params: PropertyListParams,
        ): HttpResponseFor<CollectionResponsePropertyNoPaging> =
            list(objectType, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            objectType: String,
            params: PropertyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePropertyNoPaging> =
            list(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(params: PropertyListParams): HttpResponseFor<CollectionResponsePropertyNoPaging> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PropertyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePropertyNoPaging>

        /**
         * Returns a raw HTTP response for `delete
         * /media-bridge/v1/{appId}/properties/{objectType}/{propertyName}`, but is otherwise the
         * same as [PropertyService.delete].
         */
        @MustBeClosed
        fun delete(propertyName: String, params: PropertyDeleteParams): HttpResponse =
            delete(propertyName, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            propertyName: String,
            params: PropertyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().propertyName(propertyName).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: PropertyDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PropertyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /media-bridge/v1/{appId}/properties/{objectType}/batch/archive`, but is otherwise the
         * same as [PropertyService.archiveBatch].
         */
        @MustBeClosed
        fun archiveBatch(objectType: String, params: PropertyArchiveBatchParams): HttpResponse =
            archiveBatch(objectType, params, RequestOptions.none())

        /** @see archiveBatch */
        @MustBeClosed
        fun archiveBatch(
            objectType: String,
            params: PropertyArchiveBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            archiveBatch(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see archiveBatch */
        @MustBeClosed
        fun archiveBatch(params: PropertyArchiveBatchParams): HttpResponse =
            archiveBatch(params, RequestOptions.none())

        /** @see archiveBatch */
        @MustBeClosed
        fun archiveBatch(
            params: PropertyArchiveBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /media-bridge/v1/{appId}/properties/{objectType}/batch/create`, but is otherwise the same
         * as [PropertyService.createBatch].
         */
        @MustBeClosed
        fun createBatch(
            objectType: String,
            params: PropertyCreateBatchParams,
        ): HttpResponseFor<BatchResponseProperty> =
            createBatch(objectType, params, RequestOptions.none())

        /** @see createBatch */
        @MustBeClosed
        fun createBatch(
            objectType: String,
            params: PropertyCreateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseProperty> =
            createBatch(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see createBatch */
        @MustBeClosed
        fun createBatch(params: PropertyCreateBatchParams): HttpResponseFor<BatchResponseProperty> =
            createBatch(params, RequestOptions.none())

        /** @see createBatch */
        @MustBeClosed
        fun createBatch(
            params: PropertyCreateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseProperty>

        /**
         * Returns a raw HTTP response for `get
         * /media-bridge/v1/{appId}/properties/{objectType}/{propertyName}`, but is otherwise the
         * same as [PropertyService.get].
         */
        @MustBeClosed
        fun get(propertyName: String, params: PropertyGetParams): HttpResponseFor<Property> =
            get(propertyName, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            propertyName: String,
            params: PropertyGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Property> =
            get(params.toBuilder().propertyName(propertyName).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: PropertyGetParams): HttpResponseFor<Property> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: PropertyGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Property>

        /**
         * Returns a raw HTTP response for `post
         * /media-bridge/v1/{appId}/properties/{objectType}/batch/read`, but is otherwise the same
         * as [PropertyService.getBatch].
         */
        @MustBeClosed
        fun getBatch(
            objectType: String,
            params: PropertyGetBatchParams,
        ): HttpResponseFor<BatchResponseProperty> =
            getBatch(objectType, params, RequestOptions.none())

        /** @see getBatch */
        @MustBeClosed
        fun getBatch(
            objectType: String,
            params: PropertyGetBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseProperty> =
            getBatch(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see getBatch */
        @MustBeClosed
        fun getBatch(params: PropertyGetBatchParams): HttpResponseFor<BatchResponseProperty> =
            getBatch(params, RequestOptions.none())

        /** @see getBatch */
        @MustBeClosed
        fun getBatch(
            params: PropertyGetBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseProperty>
    }
}
