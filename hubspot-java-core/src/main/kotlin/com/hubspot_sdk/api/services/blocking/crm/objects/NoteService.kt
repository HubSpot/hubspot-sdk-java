// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.notes.NoteCreateParams
import com.hubspot_sdk.api.models.crm.objects.notes.NoteDeleteParams
import com.hubspot_sdk.api.models.crm.objects.notes.NoteGetParams
import com.hubspot_sdk.api.models.crm.objects.notes.NoteListPage
import com.hubspot_sdk.api.models.crm.objects.notes.NoteListParams
import com.hubspot_sdk.api.models.crm.objects.notes.NoteSearchParams
import com.hubspot_sdk.api.models.crm.objects.notes.NoteUpdateParams
import com.hubspot_sdk.api.services.blocking.crm.objects.notes.BatchService
import java.util.function.Consumer

interface NoteService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NoteService

    fun batch(): BatchService

    /**
     * Create a note with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard notes is provided.
     */
    fun create(params: NoteCreateParams): SimplePublicObject = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: NoteCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        create(
            NoteCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): SimplePublicObject = create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of an Object identified by `{noteId}`or optionally a unique property
     * value as specified by the `idProperty` query param. `{noteId}` refers to the internal object
     * ID by default, and the `idProperty` query param refers to a property whose values are unique
     * for the object. Provided property values will be overwritten. Read-only and non-existent
     * properties will result in an error. Properties values can be cleared by passing an empty
     * string.
     */
    fun update(noteId: String, params: NoteUpdateParams): SimplePublicObject =
        update(noteId, params, RequestOptions.none())

    /** @see update */
    fun update(
        noteId: String,
        params: NoteUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject = update(params.toBuilder().noteId(noteId).build(), requestOptions)

    /** @see update */
    fun update(params: NoteUpdateParams): SimplePublicObject = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: NoteUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** Read a page of notes. Control what is returned via the `properties` query param. */
    fun list(): NoteListPage = list(NoteListParams.none())

    /** @see list */
    fun list(
        params: NoteListParams = NoteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NoteListPage

    /** @see list */
    fun list(params: NoteListParams = NoteListParams.none()): NoteListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): NoteListPage =
        list(NoteListParams.none(), requestOptions)

    /** Move an Object identified by `{noteId}` to the recycling bin. */
    fun delete(noteId: String) = delete(noteId, NoteDeleteParams.none())

    /** @see delete */
    fun delete(
        noteId: String,
        params: NoteDeleteParams = NoteDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().noteId(noteId).build(), requestOptions)

    /** @see delete */
    fun delete(noteId: String, params: NoteDeleteParams = NoteDeleteParams.none()) =
        delete(noteId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: NoteDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: NoteDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(noteId: String, requestOptions: RequestOptions) =
        delete(noteId, NoteDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{noteId}`. `{noteId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(noteId: String): SimplePublicObjectWithAssociations = get(noteId, NoteGetParams.none())

    /** @see get */
    fun get(
        noteId: String,
        params: NoteGetParams = NoteGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().noteId(noteId).build(), requestOptions)

    /** @see get */
    fun get(
        noteId: String,
        params: NoteGetParams = NoteGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(noteId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: NoteGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: NoteGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(noteId: String, requestOptions: RequestOptions): SimplePublicObjectWithAssociations =
        get(noteId, NoteGetParams.none(), requestOptions)

    /**
     * Execute a search for notes using filters, sorting options, and other query parameters to
     * refine the results. This endpoint allows for complex queries to locate specific notes within
     * the CRM system.
     */
    fun search(params: NoteSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: NoteSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            NoteSearchParams.builder().publicObjectSearchRequest(publicObjectSearchRequest).build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CollectionResponseWithTotalSimplePublicObject =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [NoteService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): NoteService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/notes`, but is otherwise the
         * same as [NoteService.create].
         */
        @MustBeClosed
        fun create(params: NoteCreateParams): HttpResponseFor<SimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: NoteCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            create(
                NoteCreateParams.builder()
                    .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
        ): HttpResponseFor<SimplePublicObject> =
            create(simplePublicObjectInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/notes/{noteId}`, but is
         * otherwise the same as [NoteService.update].
         */
        @MustBeClosed
        fun update(noteId: String, params: NoteUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(noteId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            noteId: String,
            params: NoteUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().noteId(noteId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: NoteUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: NoteUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/notes`, but is otherwise the
         * same as [NoteService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<NoteListPage> = list(NoteListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: NoteListParams = NoteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NoteListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: NoteListParams = NoteListParams.none()): HttpResponseFor<NoteListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<NoteListPage> =
            list(NoteListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/notes/{noteId}`, but is
         * otherwise the same as [NoteService.delete].
         */
        @MustBeClosed
        fun delete(noteId: String): HttpResponse = delete(noteId, NoteDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            noteId: String,
            params: NoteDeleteParams = NoteDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().noteId(noteId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            noteId: String,
            params: NoteDeleteParams = NoteDeleteParams.none(),
        ): HttpResponse = delete(noteId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: NoteDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: NoteDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(noteId: String, requestOptions: RequestOptions): HttpResponse =
            delete(noteId, NoteDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/notes/{noteId}`, but is
         * otherwise the same as [NoteService.get].
         */
        @MustBeClosed
        fun get(noteId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(noteId, NoteGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            noteId: String,
            params: NoteGetParams = NoteGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().noteId(noteId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            noteId: String,
            params: NoteGetParams = NoteGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(noteId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: NoteGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(params: NoteGetParams): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            noteId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(noteId, NoteGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/notes/search`, but is
         * otherwise the same as [NoteService.search].
         */
        @MustBeClosed
        fun search(
            params: NoteSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: NoteSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                NoteSearchParams.builder()
                    .publicObjectSearchRequest(publicObjectSearchRequest)
                    .build(),
                requestOptions,
            )

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(publicObjectSearchRequest, RequestOptions.none())
    }
}
