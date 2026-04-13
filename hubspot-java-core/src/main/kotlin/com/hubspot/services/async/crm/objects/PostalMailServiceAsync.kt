// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.crm.objects

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot.models.crm.PublicObjectSearchRequest
import com.hubspot.models.crm.SimplePublicObject
import com.hubspot.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot.models.crm.objects.postalmail.PostalMailCreateParams
import com.hubspot.models.crm.objects.postalmail.PostalMailDeleteParams
import com.hubspot.models.crm.objects.postalmail.PostalMailGetParams
import com.hubspot.models.crm.objects.postalmail.PostalMailListPageAsync
import com.hubspot.models.crm.objects.postalmail.PostalMailListParams
import com.hubspot.models.crm.objects.postalmail.PostalMailSearchParams
import com.hubspot.models.crm.objects.postalmail.PostalMailUpdateParams
import com.hubspot.services.async.crm.objects.postalmail.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PostalMailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PostalMailServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Create a postal mail object with the given properties and return a copy of the object,
     * including the ID.
     */
    fun create(params: PostalMailCreateParams): CompletableFuture<SimplePublicObject> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PostalMailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        create(
            PostalMailCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): CompletableFuture<SimplePublicObject> =
        create(simplePublicObjectInputForCreate, RequestOptions.none())

    fun update(
        postalMailId: String,
        params: PostalMailUpdateParams,
    ): CompletableFuture<SimplePublicObject> = update(postalMailId, params, RequestOptions.none())

    /** @see update */
    fun update(
        postalMailId: String,
        params: PostalMailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().postalMailId(postalMailId).build(), requestOptions)

    /** @see update */
    fun update(params: PostalMailUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PostalMailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    fun list(): CompletableFuture<PostalMailListPageAsync> = list(PostalMailListParams.none())

    /** @see list */
    fun list(
        params: PostalMailListParams = PostalMailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PostalMailListPageAsync>

    /** @see list */
    fun list(
        params: PostalMailListParams = PostalMailListParams.none()
    ): CompletableFuture<PostalMailListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PostalMailListPageAsync> =
        list(PostalMailListParams.none(), requestOptions)

    /** Move the postal mail object with the ID `{postalMailId}` to the recycling bin. */
    fun delete(postalMailId: String): CompletableFuture<Void?> =
        delete(postalMailId, PostalMailDeleteParams.none())

    /** @see delete */
    fun delete(
        postalMailId: String,
        params: PostalMailDeleteParams = PostalMailDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().postalMailId(postalMailId).build(), requestOptions)

    /** @see delete */
    fun delete(
        postalMailId: String,
        params: PostalMailDeleteParams = PostalMailDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(postalMailId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PostalMailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: PostalMailDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(postalMailId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(postalMailId, PostalMailDeleteParams.none(), requestOptions)

    fun get(postalMailId: String): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(postalMailId, PostalMailGetParams.none())

    /** @see get */
    fun get(
        postalMailId: String,
        params: PostalMailGetParams = PostalMailGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().postalMailId(postalMailId).build(), requestOptions)

    /** @see get */
    fun get(
        postalMailId: String,
        params: PostalMailGetParams = PostalMailGetParams.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(postalMailId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PostalMailGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /** @see get */
    fun get(params: PostalMailGetParams): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        postalMailId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(postalMailId, PostalMailGetParams.none(), requestOptions)

    /** Search for postal mail objects using specific criteria in the request. */
    fun search(
        params: PostalMailSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: PostalMailSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(
            PostalMailSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(publicObjectSearchRequest, RequestOptions.none())

    /**
     * A view of [PostalMailServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PostalMailServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/postal_mail`, but is otherwise
         * the same as [PostalMailServiceAsync.create].
         */
        fun create(
            params: PostalMailCreateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PostalMailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(
                PostalMailCreateParams.builder()
                    .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(simplePublicObjectInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/postal_mail/{postalMailId}`,
         * but is otherwise the same as [PostalMailServiceAsync.update].
         */
        fun update(
            postalMailId: String,
            params: PostalMailUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(postalMailId, params, RequestOptions.none())

        /** @see update */
        fun update(
            postalMailId: String,
            params: PostalMailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().postalMailId(postalMailId).build(), requestOptions)

        /** @see update */
        fun update(
            params: PostalMailUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PostalMailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/postal_mail`, but is otherwise
         * the same as [PostalMailServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PostalMailListPageAsync>> =
            list(PostalMailListParams.none())

        /** @see list */
        fun list(
            params: PostalMailListParams = PostalMailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PostalMailListPageAsync>>

        /** @see list */
        fun list(
            params: PostalMailListParams = PostalMailListParams.none()
        ): CompletableFuture<HttpResponseFor<PostalMailListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PostalMailListPageAsync>> =
            list(PostalMailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/postal_mail/{postalMailId}`,
         * but is otherwise the same as [PostalMailServiceAsync.delete].
         */
        fun delete(postalMailId: String): CompletableFuture<HttpResponse> =
            delete(postalMailId, PostalMailDeleteParams.none())

        /** @see delete */
        fun delete(
            postalMailId: String,
            params: PostalMailDeleteParams = PostalMailDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().postalMailId(postalMailId).build(), requestOptions)

        /** @see delete */
        fun delete(
            postalMailId: String,
            params: PostalMailDeleteParams = PostalMailDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(postalMailId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PostalMailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: PostalMailDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            postalMailId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(postalMailId, PostalMailDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/postal_mail/{postalMailId}`,
         * but is otherwise the same as [PostalMailServiceAsync.get].
         */
        fun get(
            postalMailId: String
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(postalMailId, PostalMailGetParams.none())

        /** @see get */
        fun get(
            postalMailId: String,
            params: PostalMailGetParams = PostalMailGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().postalMailId(postalMailId).build(), requestOptions)

        /** @see get */
        fun get(
            postalMailId: String,
            params: PostalMailGetParams = PostalMailGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(postalMailId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: PostalMailGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /** @see get */
        fun get(
            params: PostalMailGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            postalMailId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(postalMailId, PostalMailGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/postal_mail/search`, but is
         * otherwise the same as [PostalMailServiceAsync.search].
         */
        fun search(
            params: PostalMailSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: PostalMailSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(
                PostalMailSearchParams.builder()
                    .publicObjectSearchRequest(publicObjectSearchRequest)
                    .build(),
                requestOptions,
            )

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(publicObjectSearchRequest, RequestOptions.none())
    }
}
