$assert.notThrows(function () {
  var x = -1 >>> 1;
  $assert.sameValue(x, 4294967295);
});
