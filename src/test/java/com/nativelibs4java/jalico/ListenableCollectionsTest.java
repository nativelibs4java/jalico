package com.nativelibs4java.jalico;

import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import static org.mockito.Mockito.*;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Sample test.
 * 
 * Note that this does not follow any good JUnit / Mockito practice.
 * 
 * Many more tests are needed, if you wish to help please read
 * http://site.mockito.org/ and other relevant sites and send lots of
 * pull-requests on Github!
 *
 * @author ochafik
 */
@RunWith(MockitoJUnitRunner.class)
public class ListenableCollectionsTest {
    @Mock CollectionListener<Integer> mockedListener;
  
    ListenableList<Integer> list = ListenableCollections.listenableList(new ArrayList<Integer>());
    
    @Before
    public void setUp() {
        list = ListenableCollections.listenableList(new ArrayList<Integer>());
        list.addCollectionListener(mockedListener);
    }

    @Test
    public void listenableList_add_sendsAnEvent() {
        list.add(1);
        assertEquals(1, list.size());

        verify(mockedListener).collectionChanged(any(CollectionEvent.class));
    }
}
